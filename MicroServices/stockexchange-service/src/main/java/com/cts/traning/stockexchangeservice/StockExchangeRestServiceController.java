package com.cts.traning.stockexchangeservice;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.cts.traning.stockexchangeservice.StockExchange;
import com.cts.traning.stockexchangeservice.StockExchangeRepo;
@RestController
@CrossOrigin(origins="*")
public class StockExchangeRestServiceController {
	@Autowired
	StockExchangeRepo stockExchangeRepo;
	@Autowired
	StockExchangeService stockExchangeService; 
	@GetMapping(value="/stockexchanges",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getAllStockExchangs(){
		List<StockExchange> list = stockExchangeService.getAllStockExchanges();
		if(list.size()>0) {
			return new ResponseEntity<List<StockExchange>>(list, HttpStatus.OK);
		}
		else {
			return new ResponseEntity<String>("No Stock Exchanges found", HttpStatus.OK);
		}
	}
	@GetMapping(value="/stockexchanges/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getStockExchangeById(@PathVariable int id){
		StockExchange stockExchange = stockExchangeService.getStockExchangeById(id); 
		return new ResponseEntity<StockExchange>(stockExchange, HttpStatus.OK);
	}
	@PostMapping(value="/stockexchanges")
	public ResponseEntity<?> addStockExchange(@RequestBody StockExchange stockExchange){
		 StockExchange stock = stockExchangeService.saveStockExchange(stockExchange);
		return new ResponseEntity<StockExchange>(stock, HttpStatus.OK);
	}
	@DeleteMapping(value="/stockexchanges/{id}")
	public ResponseEntity<?> deleteStockExchange(@PathVariable int id){
	   stockExchangeService.deleteStockExchange(id);
		return  new ResponseEntity<StockExchange>( HttpStatus.OK);
	}
	@PutMapping(value = "/stockexchanges")
	public ResponseEntity<?> update(@RequestBody StockExchange stockExchange) {
		StockExchange stock = stockExchangeService.updateStockExchange(stockExchange) ;
		return  new ResponseEntity<StockExchange>(stock, HttpStatus.OK);
	}
}
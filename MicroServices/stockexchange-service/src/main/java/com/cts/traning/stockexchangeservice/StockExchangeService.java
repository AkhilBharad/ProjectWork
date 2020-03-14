package com.cts.traning.stockexchangeservice;

import java.util.List;

public interface StockExchangeService {
	

	public List<StockExchange> getAllStockExchanges();
	public StockExchange getStockExchangeById(int id);
	public StockExchange saveStockExchange(StockExchange stockexchange);
	public void deleteStockExchange(int id);
	public StockExchange updateStockExchange(StockExchange stockExchange);
	
	


}

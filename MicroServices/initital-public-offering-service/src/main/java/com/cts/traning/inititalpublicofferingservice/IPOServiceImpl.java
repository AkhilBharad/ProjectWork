package com.cts.traning.inititalpublicofferingservice;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class IPOServiceImpl implements IPOService{
	@Autowired
	IPORepo ipoRepo;
	@Override
	public IPO insert(IPO ipo) {
		IPO ipo1=ipoRepo.save(ipo);
		return ipo1;
	}
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		ipoRepo.deleteById(id);
	}
	@Override
	public IPO update(IPO ipo) {
		IPO ipo1=ipoRepo.save(ipo);
		return ipo1;
	}
	@Override
	public IPO getIpoById(int id) {
		Optional<IPO> ipoList=ipoRepo.findById(id);
		IPO ipo1=ipoList.get();
		return ipo1;
	}
	@Override
	public List<IPO> getAllIpos() {
		return ipoRepo.findAll();
	}
}
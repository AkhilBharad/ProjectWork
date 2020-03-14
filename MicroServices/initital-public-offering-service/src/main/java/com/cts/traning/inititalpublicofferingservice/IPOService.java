package com.cts.traning.inititalpublicofferingservice;
import java.util.List;
public interface IPOService {
	public IPO insert(IPO ipo);
	public void delete(int id);
	public IPO update(IPO ipo);
	public IPO getIpoById(int id);
	public List<IPO> getAllIpos();
}
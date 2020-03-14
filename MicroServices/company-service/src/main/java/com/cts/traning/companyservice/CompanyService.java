package com.cts.traning.companyservice;

import java.util.List;


public interface CompanyService {
	public List<CompanyDTO> getAllCompanies();
	public CompanyDTO insert(CompanyDTO companyDTO);
	public CompanyDTO getCompanyById(int id);
	public CompanyDTO saveCompany(CompanyDTO company);
	public void deleteCompany(int id);
	public CompanyDTO updateCompany(CompanyDTO company);
	public boolean activateCompany(String email);


}

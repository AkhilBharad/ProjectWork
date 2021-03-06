package com.cts.traning.companyservice;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import org.springframework.stereotype.Component;

public class CompanyDTO implements Serializable{
	
	private int id;
	private String companyname;
	private String ceo;
	private String boardOfDirector;
	private double turnover;
	private double noe;
	private String sector;
	private String companyCode;
	private String selectstockexchange;
	public CompanyDTO() {
	}
	
	
	public String getSelectstockexchange() {
		return selectstockexchange;
	}


	public void setSelectstockexchange(String selectstockexchange) {
		this.selectstockexchange = selectstockexchange;
	}


	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public String getCeo() {
		return ceo;
	}
	public void setCeo(String ceo) {
		this.ceo = ceo;
	}
	public String getBoardOfDirector() {
		return boardOfDirector;
	}
	public void setBoardOfDirector(String boardOfDirector) {
		this.boardOfDirector = boardOfDirector;
	}
	public double getTurnover() {
		return turnover;
	}
	public void setTurnover(double turnover) {
		this.turnover = turnover;
	}
	public double getNoe() {
		return noe;
	}
	public void setNoe(double noe) {
		this.noe = noe;
	}
	public String getSector() {
		return sector;
	}
	public void setSector(String sector) {
		this.sector = sector;
	}


	@Override
	public String toString() {
		return "CompanyDTO [id=" + id + ", companyname=" + companyname + ", ceo=" + ceo + ", boardOfDirector="
				+ boardOfDirector + ", turnover=" + turnover + ", noe=" + noe + ", sector=" + sector + ", companyCode="
				+ companyCode + ", selectstockexchange=" + selectstockexchange + "]";
	}


	public CompanyDTO(int id, String companyname, String ceo, String boardOfDirector, double turnover, double noe,
			String sector, String companyCode, String selectstockexchange) {
		super();
		this.id = id;
		this.companyname = companyname;
		this.ceo = ceo;
		this.boardOfDirector = boardOfDirector;
		this.turnover = turnover;
		this.noe = noe;
		this.sector = sector;
		this.companyCode = companyCode;
		this.selectstockexchange = selectstockexchange;
	}

	
}
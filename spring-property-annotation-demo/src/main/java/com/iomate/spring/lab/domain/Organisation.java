package com.iomate.spring.lab.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import com.iomate.spring.lab.service.BusinessService;

@Component("myorg")
public class Organisation {
	
	@Value("${nameOfCompany}")
	private String companyName;
	
	@Value("${startUpYear}")
	private int yearOfIncorporation;
	
	@Value("${postalCode}")
	private String postalCode;
	
	@Value("${empCount:2222}")
	private int employeeCount;
	
	@Value("${corporateSlogan:We build world class software!}")
	private String slogan;
	
	private BusinessService businessService;
	
	private String missionStatement;
	
	@Autowired
	private Environment env;
	
//	public void initialise() {
//		System.out.println("organisation: initialise method called");
//	}
//
//	public void destroy() {
//		System.out.println("organisation: destroy method called");
//	}

	public void preDestroy() {
		System.out.println("organisation: preConstruct called........");
	}

	public void postConstruct() {
		System.out.println("organisation: postConstruct called........");
	}

	public Organisation() {
		System.out.println("default constructor called");
	}
	
	public Organisation(String companyName, int yearOfIncorporation) {
		this.companyName = companyName;
		this.yearOfIncorporation = yearOfIncorporation;
		System.out.println("setPostalCode called");
	}
	
	public String corporateSlogan() {
		missionStatement = env.getProperty("statement");
		return missionStatement + " and also " + slogan;
	}
	

	public void setYearOfIncorporation(int yearOfIncorporation) {
		this.yearOfIncorporation = yearOfIncorporation;
		System.out.println("setYearOfIncorporation called");
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
		System.out.println("setPostalCode called");
	}

	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
		System.out.println("setEmployeeCount called");
	}

	public void setSlogan(String slogan) {
		this.slogan = slogan;
		System.out.println("setSlogan called");
	}

	public void setBusinessService(BusinessService businessService) {
		this.businessService = businessService;
		System.out.println("setBusinessService called");
	}


	public String corporateService() {
		return businessService.offerService(companyName);
	}

	@Override
	public String toString() {
		return "Organisation [companyName=" + companyName + ", yearOfIncorporation=" + yearOfIncorporation
				+ ", postalCode=" + postalCode + ", employeeCount=" + employeeCount + "]";
	}
}

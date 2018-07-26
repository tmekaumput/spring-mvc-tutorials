package com.iomate.spring.lab.domain;

import com.iomate.spring.lab.service.BusinessService;

public class Organisation {
	
	private String companyName;
	private int yearOfIncorporation;
	private String postalCode;
	private int employeeCount;
	private String slogan;
	private BusinessService businessService;
	
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

	public String corporateSlogan() {
		return slogan;
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

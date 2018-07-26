package com.iomate.spring.lab.service.impl;

import java.util.Random;

import com.iomate.spring.lab.service.BusinessService;

public class CloudServiceImpl implements BusinessService {

	public String offerService(String companyName) {
		Random random = new Random();
		String service = "\nAs an Organisation, " + companyName + 
				" offers world class Cloud computing infrastructure." +
				"\nThe annual income exceeds " + random.nextInt(revenue) + " dollars.";
		return service;
	}

	public void preDestroy() {
		System.out.println("cloudService: preConstruct called........");
	}

	public void postConstruct() {
		System.out.println("cloudService: postConstruct called........");
	}
}

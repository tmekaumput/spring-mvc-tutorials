package com.iomate.spring.lab.service.impl;

import java.util.Random;

import com.iomate.spring.lab.service.BusinessService;

public class EcommerceServiceImpl implements BusinessService {

	public String offerService(String companyName) {
		Random random = new Random();
		String service = "\nAs an Organisation, " + companyName + 
				" provides an outstanding Ecommerce platform." + 
				"\nThe annual revenue exceeds " + random.nextInt(revenue) + " dollars.";
		return service;
	}

}

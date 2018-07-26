package com.iomate.spring.lab.service.impl;

import java.util.Random;

import com.iomate.spring.lab.service.RecruitmentService;

public class ReferralRecruitmentServiceImpl implements RecruitmentService {

	public String recruitEmployees(String companyName, String departmentName, int numberOfRecruitments) {
		Random random = new Random();
		String hiringFacts = "\n" + companyName + "'s " + departmentName + " hired " + random.nextInt(numberOfRecruitments) + " employees " + 
							"which were referred to the company by employees.";
		return hiringFacts;
	}

}

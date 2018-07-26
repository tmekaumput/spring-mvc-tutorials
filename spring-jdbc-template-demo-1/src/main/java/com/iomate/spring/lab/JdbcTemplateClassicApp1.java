package com.iomate.spring.lab;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.iomate.spring.lab.dao.OrganisationDao;
import com.iomate.spring.lab.domain.Organisation;

public class JdbcTemplateClassicApp1 {

	public static void main(String[] args) {
		
		// creating the application context
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");
		
		// Create the bean
		OrganisationDao dao = (OrganisationDao) ctx.getBean("orgDao");
		
		List<Organisation> orgs = dao.getAllOrganisation();
		for (Organisation org : orgs) {
			System.out.println(org);;
		}
		
		((ClassPathXmlApplicationContext)ctx).close();
	}

}

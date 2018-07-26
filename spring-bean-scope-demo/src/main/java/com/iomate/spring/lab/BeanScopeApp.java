package com.iomate.spring.lab;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.iomate.spring.lab.domain.Organisation;

public class BeanScopeApp {

	public static void main(String[] args) {
		// create the application context (container)
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");
		
		Organisation org = (Organisation) ctx.getBean("myorg");
		System.out.println(org);
		Organisation org2 = (Organisation) ctx.getBean("myorg");
		
		org2.setPostalCode("98989");
		
		// invoke the company slogan via the bean
		//org.corporateSlogan();

		// Print Organisation details
		System.out.println(org);
		System.out.println(org2);
		
		if(org == org2) {
			System.out.println("Singleton scope test: org == org2");
		}else{
			System.out.println("Singleton scope test: org != org2");
		}
		// invoke the company solgan via the bean
		//System.out.println(org.corporateSlogan());
		
		//System.out.println(org.corporateService());
		
		// close the application context (container)
		((ClassPathXmlApplicationContext) ctx).close();
		
	}

}

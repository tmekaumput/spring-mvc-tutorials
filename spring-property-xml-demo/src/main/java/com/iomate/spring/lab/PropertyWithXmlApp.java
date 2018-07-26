package com.iomate.spring.lab;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.iomate.spring.lab.domain.Organisation;
import com.iomate.spring.lab.domain.promotion.TradeFair;

public class PropertyWithXmlApp {

	public static void main(String[] args) {
		// create the application context (container)
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");
		
		Organisation org = (Organisation)ctx.getBean("myorg");
		System.out.println(org);
		
		// close the application context (container)
		((ClassPathXmlApplicationContext) ctx).close();
		
	}

}

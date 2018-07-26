package com.iomate.spring.lab;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.iomate.spring.lab.domain.Organisation;
import com.iomate.spring.lab.domain.promotion.TradeFair;

public class AutowiredAnnotationApp {

	public static void main(String[] args) {
		// create the application context (container)
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");
		
		TradeFair tradeFair = (TradeFair)ctx.getBean("myfair");
		System.out.println(tradeFair.specialPromotionalPricing());
		
		// close the application context (container)
		((ClassPathXmlApplicationContext) ctx).close();
		
	}

}

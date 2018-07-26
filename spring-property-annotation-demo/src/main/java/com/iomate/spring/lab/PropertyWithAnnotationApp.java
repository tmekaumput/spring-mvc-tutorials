package com.iomate.spring.lab;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.iomate.spring.lab.domain.Organisation;

public class PropertyWithAnnotationApp {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(PropertyConfig.class);
		Organisation org = (Organisation)ctx.getBean("myorg");
		System.out.println(org);
		System.out.println("slogan: " + org.corporateSlogan());
		((AnnotationConfigApplicationContext)ctx).close();
	}

}

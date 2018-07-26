package tutorial.spring.lab1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import tutorial.spring.lab1.domain.Organisation;

public class CNamespaceApp {

	public static void main(String[] args) {
		// create the application context (container)
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");
		
		Organisation org = (Organisation) ctx.getBean("myorg");
		
		// Print Organisation details
		System.out.println(org);
		
		// close the application context (container)
		((ClassPathXmlApplicationContext) ctx).close();
		
	}

}

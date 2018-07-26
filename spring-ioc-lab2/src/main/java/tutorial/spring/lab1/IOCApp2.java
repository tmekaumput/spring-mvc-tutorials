package tutorial.spring.lab1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCApp2 {

	public static void main(String[] args) {
		// create the application context (container)
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");
		
		Organisation org = (Organisation) ctx.getBean("myorg");
		
		// invoke the company slogan via the bean
		org.corporateSlogan();
		
		// close the application context (container)
		((ClassPathXmlApplicationContext) ctx).close();
		
	}

}

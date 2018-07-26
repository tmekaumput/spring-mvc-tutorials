package tutorial.spring.lab1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanFactoryApp {

	public static void main(String[] args) {
		// create the application context (container)
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");
		
		Organisation org = (Organisation) ctx.getBean("myorg");
		Organisation org2 = (Organisation) ctx.getBean("myorg2");
		
		// invoke the company slogan via the bean
		//org.corporateSlogan();

		// Print Organisation details
		System.out.println(org);
		System.out.println(org2);
		
		// close the application context (container)
		((ClassPathXmlApplicationContext) ctx).close();
		
	}

}

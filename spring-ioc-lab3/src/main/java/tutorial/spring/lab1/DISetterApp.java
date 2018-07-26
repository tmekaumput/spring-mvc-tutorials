package tutorial.spring.lab1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.iomate.spring.lab.domain.Organisation;

public class DISetterApp {

	public static void main(String[] args) {
		// create the application context (container)
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");
		
		Organisation org = (Organisation) ctx.getBean("myorg");
		
		// invoke the company slogan via the bean
		org.corporateSlogan();

		// Print Organisation details
		System.out.println(org);
		
		// invoke the company solgan via the bean
		System.out.println(org.corporateSlogan());
		
		System.out.println(org.corporateService());
		
		// close the application context (container)
		((ClassPathXmlApplicationContext) ctx).close();
		
	}

}

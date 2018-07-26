package tutorial.spring.lab1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.iomate.spring.lab.domain.HumanResourceDept;
import com.iomate.spring.lab.domain.Organisation;

public class DIConstructorApp {

	public static void main(String[] args) {
		// create the application context (container)
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");
		
		Organisation org = (Organisation) ctx.getBean("myorg");
		
		// invoke the company slogan via the bean
		org.corporateSlogan();

		// Print Organisation details
		System.out.println(org);
		
		// invoke the company solgan via the bean
		//System.out.println(org.corporateSlogan());
		
		//System.out.println(org.corporateService());
		HumanResourceDept hrdept = (HumanResourceDept)ctx.getBean("myhrdept");
		System.out.println(hrdept.hiringStatus(5500));
		
		
		// close the application context (container)
		((ClassPathXmlApplicationContext) ctx).close();
		
	}

}

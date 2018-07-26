package tutorial.spring.lab1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class IOCApp1 {

	public static void main(String[] args) {
		// create the application context (container)
		ApplicationContext ctx = new FileSystemXmlApplicationContext("beans.xml");
		Organisation org = (Organisation) ctx.getBean("myorg");
		
		// invoke the company slogan via the bean
		org.corporateSlogan();
		
		// close the application context (container)
		((FileSystemXmlApplicationContext) ctx).close();
		
	}

}

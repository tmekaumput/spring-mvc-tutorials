package challenge;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class IOCAppChallenge2 {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-challenge.xml");
		
		MyObject myobj = (MyObject)ctx.getBean("myobj");
		
		myobj.doSomething();
		
		((ClassPathXmlApplicationContext)ctx).close();
	}

}

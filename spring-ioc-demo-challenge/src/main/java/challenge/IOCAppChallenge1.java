package challenge;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class IOCAppChallenge1 {

	public static void main(String[] args) {
		ApplicationContext ctx = new FileSystemXmlApplicationContext("beans-challenge.xml");
		
		MyObject myobj = (MyObject)ctx.getBean("myobj");
		
		myobj.doSomething();
		
		((FileSystemXmlApplicationContext)ctx).close();
	}

}

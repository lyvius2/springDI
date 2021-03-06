package sample7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App {

	public static void main(String[] args){
		ApplicationContext context = new GenericXmlApplicationContext("classpath:/sample7/context.xml");
		
		Reporter r = context.getBean(Reporter.class);
		
		r.reporting();
	}
}

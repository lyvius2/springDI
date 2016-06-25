package sample5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App {

	public static void main(String[] args){
		ApplicationContext context = new GenericXmlApplicationContext("classpath:/sample5/context.xml");
		
		DatabaseConnection db = context.getBean("db", DatabaseConnection.class);
		
		db.connect();
	}
	
}

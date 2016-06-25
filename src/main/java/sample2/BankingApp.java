package sample2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BankingApp {

	public static void main(String[] args){
		ApplicationContext context = new GenericXmlApplicationContext("classpath:/sample2/context.xml");
		
		BankingService service = context.getBean("banking", BankingService.class);
		
		service.deposit(2000000);
	}
}

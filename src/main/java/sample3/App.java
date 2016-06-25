package sample3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App {

	public static void main(String[] args){
		
		ApplicationContext context = new GenericXmlApplicationContext("classpath:/sample3/context.xml");
		
		ProductService service = context.getBean(ProductService.class);
		
		service.add();
	}
}

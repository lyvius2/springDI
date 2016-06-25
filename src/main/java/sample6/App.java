package sample6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args){
		
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		EventService service = context.getBean(EventService.class);
		service.event("신작 게임 할인 행사 7월부터 실시");
	}
}

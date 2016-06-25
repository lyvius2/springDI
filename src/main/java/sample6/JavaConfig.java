package sample6;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ch.qos.logback.core.net.SyslogOutputStream;

@Configuration
public class JavaConfig {

	/*
	 *  <bean id="sender" class="sample6.SmsMessageSender" />
	 */
	@Bean
	public MessageSender sender(){
		System.out.println("Message 객체 생성됨");
		return new SmsMessageSender();
	}
	
	/*
	 * <bean id="service" class="sample6.EventService">
	 * 		<property name="sender" ref="sms" />
	 * </bean>
	 */
	@Bean
	public EventService service(MessageSender sms){
		System.out.println("EventService 객체 생성됨");
		EventService service = new EventService();
		service.setSender(sms);
		return service;
	}
	
	@Bean
	public SaleService sale(MessageSender sms){
		System.out.println("SaleService 객체 생성됨");
		SaleService service = new SaleService();
		service.setSender(sms);
		return service;
	}
	
}

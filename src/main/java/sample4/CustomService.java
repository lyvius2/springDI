package sample4;

import sample2.Logger;

public class CustomService {

	private Logger logger;
	private Notification notification;
	
	public CustomService(){}
	
	// Notification객체를 전달받는 생성자 정의
	public CustomService(Notification notification, Logger logger){
		this.notification = notification;
		this.logger = logger;
	}
	
	// Notification객체를 전달받는 setter 함수 정의
	public void setNotification(Notification notification){
		this.notification = notification;
	}
	
	public void setLogger(Logger logger) {
		this.logger = logger;
	}

	public void eventNotice(String event){
		notification.notice(event);
	}
}

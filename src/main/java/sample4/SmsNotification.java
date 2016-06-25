package sample4;

public class SmsNotification implements Notification {

	// JAVA에서는 Class를 생성하기 전에 우선 interface를 생성하자. -> 강사 권장사항
	@Override
	public void notice(String message){
		System.out.println("sms 발송 : " + message);
	}
}

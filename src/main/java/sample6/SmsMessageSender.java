package sample6;

public class SmsMessageSender implements MessageSender {

	@Override
	public void send(String message){
		System.out.println("문자 발송 : " + message);
	}
}

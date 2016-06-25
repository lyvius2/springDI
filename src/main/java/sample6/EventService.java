package sample6;

public class EventService {

	MessageSender sender;
	
	public void setSender(MessageSender sender) {
		this.sender = sender;
	}

	public void event(String message){
		sender.send(message);
	}
}

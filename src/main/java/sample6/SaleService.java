package sample6;

public class SaleService {

	private MessageSender sender;
	
	public void setSender(MessageSender sender) {
		this.sender = sender;
	}

	public void sale(String message){
		sender.send(message);
	}
}

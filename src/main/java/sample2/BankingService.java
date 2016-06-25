package sample2;

public class BankingService {
	
	int balance = 1000000000;
	
	//Logger logger = new FileLogger();	//잘못된 방법
	Logger logger;
	
	// Logger류 객체를 전달받기 위한 메서드를 제공한다.
	public void setLogger(Logger logger){
		this.logger = logger;
	}
	
	public void deposit(int currency){
		balance += currency;
		logger.write(currency + "원 입금완료");
	}
	
	public void withdraw(int currency){
		balance -= currency;
		logger.write(currency + "원 출금완료");
	}
}

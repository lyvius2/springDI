package sample1;

public class DepositService {
	// 의존하는 객체 생성
	SimpleLogger logger = new SimpleLogger();
	
	int balance = 0;
	
	public void deposit(int currency){
		
		// 적립
		balance += currency;
		logger.writer("적립금액 : " + currency);
	}
}

package sample2;

public class Factory {

	public BankingService create(){
		
		// BankingService 객체와 FileLogger 객체 생성
		BankingService banking = new BankingService();
		FileLogger logger = new FileLogger();
		
		// BankingService 객체에 FileLogger 객체 주입
		banking.setLogger(logger);
		
		// 준비된 BankingService를 반환.
		return banking;
	}
}

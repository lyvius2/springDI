package sample2;

public class DBLogger implements Logger {

	@Override
	public void write(String message){
		System.out.println("데이타베이스에 저장 : " + message);
	}
}

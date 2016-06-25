package sample2;

public class FileLogger implements Logger {

	public void write(String message){
		System.out.println("파일에 저장: " + message);
	}
}

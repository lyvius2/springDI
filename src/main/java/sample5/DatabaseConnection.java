package sample5;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("db")
public class DatabaseConnection {

	@Value("${db.username}")
	private String username;
	@Value("${db.password}")
	private String password;
	
	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void connect(){
		System.out.println(username + " " + password + " connected");
	}
}

package beans;

import java.sql.Connection;
import java.sql.DriverManager;


public class Test {
	
	private String driver;
	private String url;
	private String username;
	private String password;
	
	
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void printConn() throws Exception{
		Class.forName(driver);
		Connection con=DriverManager.getConnection(url,username,password);
	}

}

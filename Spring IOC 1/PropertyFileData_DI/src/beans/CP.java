package beans;

import java.sql.Connection;
import java.sql.DriverManager;



public class CP {
	private String driver,url,username,password;

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

	public void createConnection(){
		try{
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url,username,password);
			System.out.println(con);
		}catch(Exception e){
			
		}
	}
}

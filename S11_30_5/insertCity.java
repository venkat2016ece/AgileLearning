package S11_30_5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class insertCity {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//load class
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//java-db
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","venkatdb","oracle");
		
		connection.setAutoCommit(false);
		
		
		Statement statement=connection.createStatement();
		
		statement.executeUpdate("INSERT INTO city (name) VALUES('Chicago')");
		statement.executeUpdate("INSERT INTO city (name) VALUES('Detroit')");
		statement.executeUpdate("INSERT INTO city (name) VALUES('Toronto')");
		
		connection.commit();
		connection.close();
		System.out.println("success");
		
		
		
	}

}

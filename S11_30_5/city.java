package S11_30_5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class city {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, InterruptedException {
		//load the driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//provide the connection  java-db
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","VENKATDB","oracle");
		System.out.println("conection created successfully....");
		Thread.sleep(2000);
		Statement statement=connection.createStatement();
		//write quiry
		String q1="CREATE TABLE  city (name varchar2(30)  NOT NULL,PRIMARY KEY (name))";
		int x=statement.executeUpdate(q1);
		 System.out.println("table created successfully...."+x);
		 //step 5 close
		 connection.close();
		 System.out.println("connection closed......");
	}

}

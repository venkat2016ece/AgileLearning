package S11_30_5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class zpublisher {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//load the class
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//conn java-db
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","VENKATDB","oracle");
		System.out.println("connection created successfully......");
		Statement statement=connection.createStatement();
		//write quiry
		String q1="CREATE TABLE  zpublisher (publisher_id number(11) NOT NULL,name varchar2(40) ,address varchar2(40) ,city varchar2(20) ,state varchar2(2) ,PRIMARY KEY (publisher_id))";
		int x=statement.executeUpdate(q1);
		System.out.println("table created successfully........"+x);
		//close the connection..
		connection.close();
		System.out.println("conection closed....");
		
	}

}

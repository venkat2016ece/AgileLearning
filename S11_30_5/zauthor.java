package S11_30_5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class zauthor {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//load the class
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//conn java - db
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","VENKATDB","oracle");
		System.out.println("connection created successfully......");
		Statement statement=connection.createStatement();
		
		//write quiry
		String q1="CREATE TABLE  zauthor (ssn varchar2(11)  NOT NULL,lastname varchar2(40)  NOT NULL,firstname varchar2(20)  NOT NULL,phone varchar2(12) ,address varchar2(40) ,city varchar2(20) ,state varchar2(2) ,zip varchar2(5) ,PRIMARY KEY (ssn))";
		int x=statement.executeUpdate(q1);
		System.out.println("Table created succussfully.........."+x);
		connection.close();
		System.out.println("connection closed.......");
	}

}

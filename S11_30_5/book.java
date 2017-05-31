package S11_30_5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class book {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, InterruptedException {
		//load the driver class
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//provide the connection between java-database
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","VENKATDB","oracle");
		System.out.println("connection created succesfully");
		Thread.sleep(2000);
		Statement statement=connection.createStatement();
		//write the quiry
		String q1="CREATE TABLE  book (isbn varchar2(13)  NOT NULL,title varchar2(80)  NOT NULL,type varchar2(12) ,pub_id varchar2(4) ,price number(9,2) ,advance number(9,2) ,ytd_sales number(11) ,pubdate date ,PRIMARY KEY (isbn))" ;
		int x=statement.executeUpdate(q1);
		System.out.println("table is created successfully......");
		//step 5 close
		connection.close();
		System.out.println("connection close..........");
		
	}

}

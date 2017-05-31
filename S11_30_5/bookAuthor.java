package S11_30_5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class bookAuthor {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, InterruptedException {
		//load the driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//provide the connection between java-db
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","venkatdb","oracle");
		System.out.println("connection is created........");
		Thread.sleep(2000);
		Statement statement=connection.createStatement();
		
		//step 3 write the quiry
		String q1="CREATE TABLE  bookauthor (author_id number(11) NOT NULL,isbn varchar2(13)  NOT NULL,author_order number(11) NOT NULL,royaltyshare number(5,2) ,PRIMARY KEY (author_id,isbn))";
		//exicute the quiry by using statement object.
		int x=statement.executeUpdate(q1);
		System.out.println("table is created successfully...........");
		//step 5 close.
		connection.close();
		System.out.println("conection closed");
		
	}

}

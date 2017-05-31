package S11_30_5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class zbookauthor {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//load the class
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//conn java- db
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","VENKATDB","oracle");
	System.out.println("connection created successfully......");
	Statement statement=connection.createStatement();
	//write sql
	String q1="CREATE TABLE  zbookauthor (author_id varchar2(11)  NOT NULL,isbn varchar2(13)  NOT NULL,author_order number(11) NOT NULL,royaltyshare number(5,2) ,PRIMARY KEY (author_id,isbn))";
	int x=statement.executeUpdate(q1);
	System.out.println("table created successfully......."+x);
	connection.close();
	System.out.println("connection closed......");
		
		
	}

}


package S11_30_5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class author {

	public static void main(String[] args) {
		try{
			//load the driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//provide the connection between java-database
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","venkatdb","oracle");
			System.out.println("connection is created.......");
			Thread.sleep(2000);
			Statement statement=con.createStatement();
			//write quairy
			String q1="CREATE TABLE author(author_id number(11) NOT NULL,ssn varchar2(11) ,lastname varchar2(40)  NOT NULL,firstname varchar2(20)  NOT NULL,phone varchar2(12) ,address varchar2(40) ,city varchar2(20) ,state varchar2(2) ,zip varchar2(5) ,PRIMARY KEY (author_id))";
			//exicute the quiry by using the statement object
			int x=statement.executeUpdate(q1);
			System.out.println("table is created successfully="+x);
			//step 5 close
			con.close();
		}catch(Exception e){}
	}

}

package S11_30_5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class editor {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, InterruptedException {
		//load the driver class
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//provide the connection b/w java - db
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","VENKATDB","oracle");
		System.out.println("connection created successfully......");
		Thread.sleep(2000);
		Statement statement=connection.createStatement();
		//write the quiry
		String q1="CREATE TABLE  editor (editor_id number(11) NOT NULL,ssn varchar2(11) ,lastname varchar2(40)  NOT NULL,firstname varchar2(20)  NOT NULL,phone varchar2(12) ,editor_position varchar2(20)  NOT NULL,salary number(9,2) NOT NULL,PRIMARY KEY (editor_id)) ";
		int x=statement.executeUpdate(q1);
		System.out.println("table created successfully......"+x);
		//step 5 close
		connection.close();
		System.out.println("conection closed............");
		
	}

}

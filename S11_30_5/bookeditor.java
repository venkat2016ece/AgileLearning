package S11_30_5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class bookeditor {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, InterruptedException {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//connection java-db
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","VENKATDB","oracle");
		System.out.println("connection created successfully.......");
		Thread.sleep(2000);
		Statement statement=connection.createStatement();
		//write quiry
		String q1="CREATE TABLE  bookeditor (editor_id number(11) NOT NULL,isbn varchar2(13)  NOT NULL,PRIMARY KEY (editor_id,isbn)) ";
		//exicute the quiry by statement
		int x=statement.executeUpdate(q1);
		System.out.println("table is created successfully......."+x);
		//step 5 close
		connection.close();
		System.out.println("connection closed......");
		
		
	}

}

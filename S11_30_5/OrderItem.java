package S11_30_5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class OrderItem {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, InterruptedException {
		//load the driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//provide the connection  java-db
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","VENKATDB","oracle");
		System.out.println("conection created successfully....");
		Thread.sleep(2000);
		Statement statement=connection.createStatement();
		//write quiry
		String q1="CREATE TABLE ORDERITEM(order_num	number(4) NOT NULL,item_num	number(2)  NOT NULL,ISBN varchar2(13),quantity number(3),orderdate	date,primary key(order_num, item_num))";
		int x=statement.executeUpdate(q1);
		 System.out.println("table created successfully...."+x);
		 
		 
		 
		 Statement statement2=connection.createStatement();
		 statement2.executeUpdate("INSERT INTO ORDERITEM VALUES (1000,1,'1-8888-8888-x',1, TO_DATE ('2-JUL-12', 'DD-MON-YY'))");
		 statement2.executeUpdate("INSERT INTO ORDERITEM VALUES (1001,1,'1-1032-1032-x',1, TO_DATE ('2-JUL-12', 'DD-MON-YY'))");
		 statement2.executeUpdate("INSERT INTO ORDERITEM VALUES (1001,2,'1-3333-3333-x',1, TO_DATE ('2-JUL-12', 'DD-MON-YY'))");
		 statement2.executeUpdate("INSERT INTO ORDERITEM VALUES (1003,1,'1-8888-8888-x',1, TO_DATE ('2-AUG-12', 'DD-MON-YY'))");
		 statement2.executeUpdate("INSERT INTO ORDERITEM VALUES (1003,2,'1-2222-2222-x',1, TO_DATE ('2-AUG-12', 'DD-MON-YY'))");
		 statement2.executeUpdate("INSERT INTO ORDERITEM VALUES (1004,1,'1-2222-2222-x',2, TO_DATE ('2-AUG-12', 'DD-MON-YY'))");
		 connection.commit();
		 System.out.println("inserted");
		 //step 5 close
		 connection.close();
		 System.out.println("connection closed......");
	}

}

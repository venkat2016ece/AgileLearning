package S10_25_5;
import java.sql.*;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, InterruptedException {
		//Load the driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//step-2 to provide the connetion between java-database
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","VENKATDB","oracle");
		System.out.println("connetion is created......");
		Thread.sleep(2000);
		Statement statement=connection.createStatement();
		//Step 3 write quairy 
		String q1="create table emp2(eid number,ename varchar2(30),esal number)";
		//exicute the quiry by using statement object.
		int x=statement.executeUpdate(q1);
		System.out.println("table is created succesfully="+x);
		//step 5 close.
		connection.close();
		System.out.println("connection closed");
	}

}

package S5_21_4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDb {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, InterruptedException {
		Class.forName("org.h2.Driver");
		Connection connection=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test2","sa","");
		System.out.println("connetion is created......");
		Statement statement=connection.createStatement();
		//table creation
		String q1="create table emp(eid number,ename varchar2(30),esal number)";
			int a=statement.executeUpdate(q1);
		System.out.println("table is created successfully"+q1);
		//inserting data
		String q2="insert into emp values(111,'venkat',100000)";
		String q3="insert into emp values(111,'sravan',200000)";
		String q4="insert into emp values(111,'naresh',300000)";
		statement.executeUpdate(q2);
		statement.executeUpdate(q3);
		statement.executeUpdate(q4);
		System.out.println("values are inserted successfully........");
		//remove the values
		String q5="select*from emp";
		ResultSet resultSet=statement.executeQuery(q5);
		while(resultSet.next())
		{
			System.out.println(resultSet.getInt(1)+"-----"+resultSet.getString(2)+"-------"+resultSet.getDouble(3));
		}
		System.out.println("data printing is completed");
		//update the data
		String q6="update emp set esal=esal+200 where esal>10000";
		int x=statement.executeUpdate(q6);
		System.out.println("number of records are updated="+x);
		Thread.sleep(10000);
		//drop the table 
		String q7="drop table emp";
		int y=statement.executeUpdate(q7);
		System.out.println("table droped successfully="+y);
		connection.close();
		System.out.println("all operatios are successfully completed in one single file");
		
	}

}

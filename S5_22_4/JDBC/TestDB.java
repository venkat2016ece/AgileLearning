package S5_22_4.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

//EXAMPLE:dynamic input from the keyboard
public class TestDB {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, InterruptedException {
		Class.forName("org.h2.Driver");
		Connection connection=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test2","sa","");
		Statement statement=connection.createStatement();
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter your table name");
		String tname=scanner.next();
		String q1=" create table "+tname+"(eid number,ename varchar2(30),esal number)";
		statement.executeUpdate(q1);
		System.out.println(" table is created "+ tname);
		
		while(true)
		{
			System.out.println("enter emp id");
			int eid=scanner.nextInt();
			
			System.out.println("enter emp name");
			String ename=scanner.next();
			
			System.out.println("enter emp sal");
			float esal=scanner.nextFloat();
			
			String q2="insert into "+tname+" values("+eid +",'"+ename+"',"+esal+")";
			System.out.println(q2);
			statement.executeUpdate(q2);
			System.out.println("values are inserted successfully....");
			System.out.println("do you want one more record(yes/no)");
			String option=scanner.next();
			if(option.equals("no")){
				break;
			}
		}
		Thread.sleep(15000);
		
		System.out.println("enter the table you want to drop");
		String droptable=scanner.next();
		String q3="drop table "+droptable;
		statement.executeUpdate(q3);
		System.out.println("table dropped successfully"+droptable);
		
		System.out.println("all operations are completed successfully");
		connection.close();
	}

}

package S5_22_4.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TestDB2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
			Class.forName("org.h2.Driver");
			Connection connection=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test2","sa","");
			Statement statement=connection.createStatement();
			statement.executeUpdate(" create table emp(eid number,ename varchar2(30),esal number)");
			//insert the data by using preparedstatement
			PreparedStatement preparedStatement=connection.prepareStatement("insert into emp values(?,?,?)");
			Scanner scanner=new Scanner(System.in);
			while(true)
			{
				System.out.println("enter eid");
				int eid=scanner.nextInt();
				
				System.out.println("enter ename");
				String ename=scanner.next();
				
				System.out.println("enter esal");
				float esal=scanner.nextFloat();
				
				preparedStatement.setInt(1, eid);
				preparedStatement.setString(2, ename);
				preparedStatement.setFloat(3, esal);
				int x=preparedStatement.executeUpdate();
				System.out.println(x);
				
				System.out.println("do you want onemore record yes/no");
				String option=scanner.next();
				if(option.equals("no")){
					break;
				}
				
			}
			connection.close();
			System.out.println("connection closed");
	}

}

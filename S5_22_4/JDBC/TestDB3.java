package S5_22_4.JDBC;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestDB3 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("org.h2.Driver");
		Connection connetion=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test2","sa","");
		//DatabaseMetaData
		DatabaseMetaData dbmd=connetion.getMetaData();  
		System.out.println("Driver Name: "+dbmd.getDriverName());  
		System.out.println("Driver Version: "+dbmd.getDriverVersion());  
		System.out.println("UserName: "+dbmd.getUserName());  
		System.out.println("Database Product Name: "+dbmd.getDatabaseProductName());  
		System.out.println("Database Product Version: "+dbmd.getDatabaseProductVersion());  
		
		
		
		
		
		
		PreparedStatement preparedStatement=connetion.prepareStatement("update emp set ename=? where ename=?");
		preparedStatement.setString(1,"venkataswamy");
		preparedStatement.setString(2,"ratan");
		preparedStatement.executeUpdate();
		
		preparedStatement.setString(1,"suresh");
		preparedStatement.setString(2,"nani");
		preparedStatement.executeUpdate();
		System.out.println("operations are completed");
		
		
		PreparedStatement preparedStatement2=connetion.prepareStatement("update emp set esal=esal+? where esal>?");
		preparedStatement2.setInt(1, 200);
		preparedStatement2.setInt(2, 100);
		int x=preparedStatement2.executeUpdate();
		System.out.println("updated records counts="+x);
		
		PreparedStatement preparedStatement3=connetion.prepareStatement("delete from emp where eid=?");
		preparedStatement3.setInt(1, 1);
		preparedStatement3.executeUpdate();
		preparedStatement3.setInt(1, 2);
		preparedStatement3.executeUpdate();
		preparedStatement3.setInt(1,3);
		preparedStatement3.executeUpdate();
		System.out.println("records are deleted ");
		
		//retrive
		PreparedStatement preparedStatement4=connetion.prepareStatement("select*from emp");
		ResultSet resultSet=preparedStatement4.executeQuery();
		while(resultSet.next()){
			System.out.println(resultSet.getInt(1)+"---"+resultSet.getString(2));
		}connetion.close();
	}

}

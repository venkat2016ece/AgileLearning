package S5_22_4.JDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class Proc {
	public static void main(String[] args) throws Exception{  
		  
		Class.forName("org.h2.Driver");  
		Connection con=DriverManager.getConnection(  
				"jdbc:h2:tcp://localhost/~/test2","sa","");  
		  
		CallableStatement stmt=con.prepareCall("{call insertR(?,?)}");  
		stmt.setInt(1,1011);  
		stmt.setString(2,"Amit");  
		stmt.execute();  
		  
		System.out.println("success");  
		}  
		}  
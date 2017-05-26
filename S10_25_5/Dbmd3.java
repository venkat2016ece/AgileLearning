package S10_25_5;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Dbmd3 {
	public static void main(String args[]){  
		try{  
		Class.forName("oracle.jdbc.driver.OracleDriver");  
		  
		Connection con=DriverManager.getConnection(  
		"jdbc:oracle:thin:@localhost:1521:xe","venkatdb","oracle");  
		  
		DatabaseMetaData dbmd=con.getMetaData();  
		String table[]={"VIEW"};  
		ResultSet rs=dbmd.getTables(null,null,null,table);  
		  
		while(rs.next()){  
		System.out.println(rs.getString(3));  
		}  
		  
		con.close();  
		  
		}catch(Exception e){ System.out.println(e);}  
		  
		}  
		}  


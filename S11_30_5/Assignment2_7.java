
/*
 * Exercise Solution


  SELECT title, type, advance
  FROM book
  WHERE advance > 10000;


NOTE:  You NEVER use a $ in the amount data
specified in a SQL statement.
*/
package S11_30_5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Assignment2_7 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","venkatdb","oracle");
	    System.out.println("connection created succussfully....");
	    
	    Statement statement=connection.createStatement();
	    
	    String q1="SELECT title, type, advance FROM book WHERE advance > 10000";
	    ResultSet rs=statement.executeQuery(q1);
	    
	    while(rs.next()){
	     	    	System.out.println(rs.getString(1)+"   "+rs.getString(2)+" "+rs.getInt(3));
	    }
	    rs.close();
    	connection.close();
	    
	}
		
		}

/*Question 2. List the Publisher name and city that they are based in
so that the data in the result set appears in the following format:
"Publisher AMERICAN PUBLISHING is in Boston"
Put the results in publisher name order.

	SELECT 'Publisher', name, 'is in', city
	FROM publisher
*/
package S11_30_5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Assignment2_2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","venkatdb","oracle");
	    System.out.println("connection created succussfully....");
	    
	    Statement statement=connection.createStatement();
	    
	    String q1="SELECT name,city,state FROM publisher";
	    ResultSet rs=statement.executeQuery(q1);
	    
	    while(rs.next()){
	    
	    	String name=rs.getString(1);
	    	String city=rs.getString(2);
	    	String state=rs.getString(3);
	
	    	System.out.println("NAME:"+name);
	    	System.out.println("CITY:"+city);
	    	System.out.println("STATE:"+state);
	    	
	    	 
	    }
	    rs.close();
    	connection.close();
	    
	}
		
		}



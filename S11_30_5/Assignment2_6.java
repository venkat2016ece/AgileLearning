/*Let's look at another example...

  SELECT name, city, state
  FROM publisher;
  WHERE city = 'Boston';


In Oracle, data is case-sensitive!

Boston is not the same as BOSTON or boston

Other databases, like MySQL, may be set up to
be case insensitive.
*/
package S11_30_5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Assignment2_6 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","venkatdb","oracle");
	    System.out.println("connection created succussfully....");
	    
	    Statement statement=connection.createStatement();
	    
	    String q1="SELECT name, city, state FROM publisher WHERE city = 'New York'";
	    ResultSet rs=statement.executeQuery(q1);
	    
	    while(rs.next()){
	    	String name=rs.getString(1);
	    	String city=rs.getString(2);
	    	String state=rs.getString(3);
	    	 
	    	System.out.println(name);
	    	System.out.println(city);
	    	System.out.println(state);
	    }
	    rs.close();
    	connection.close();
	    
	}
		
		}


/*Let's look at another example...

  SELECT *
  FROM book
  WHERE price > 20


Here you see all the rows AND all the columns
from the book table.

The * selector shows ALL the columns, no matter
how many rows are returned.*/
package S11_30_5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Assignment2_5 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","venkatdb","oracle");
	    System.out.println("connection created succussfully....");
	    
	    Statement statement=connection.createStatement();
	    
	    String q1="SELECT * FROM book WHERE price > 20";
	    ResultSet rs=statement.executeQuery(q1);
	    
	    while(rs.next()){
	     	    	System.out.println(rs.getString(1)+"   "+rs.getString(2)+"   "+rs.getString(3)+"   "+rs.getString(4)+"   "+rs.getInt(5)+"   "+rs.getInt(6)+"   "+rs.getInt(7)+"   "+rs.getDate(8));
	    }
	    rs.close();
    	connection.close();
	    
	}
		
		}

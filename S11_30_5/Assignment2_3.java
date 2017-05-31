/*Question 3. List the books that have been advanced less than $15,000
Sort the results by title in descending order

	SELECT title, advance
	FROM book
	WHERE advance < 15000
	ORDER BY title DESC;

*/
package S11_30_5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Assignment2_3 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","venkatdb","oracle");
	    System.out.println("connection created succussfully....");
	    
	    Statement statement=connection.createStatement();
	    
	    String q1="SELECT title, advance FROM book WHERE advance < 15000 ORDER BY title DESC";
	    ResultSet rs=statement.executeQuery(q1);
	    
	    while(rs.next()){
	    
	    	String title=rs.getString(1);
	    	int advance=rs.getInt(2);
	    	//String state=rs.getString(3);
	
	    	System.out.println("TITLE:"+title);
	    	System.out.println("ADVANCE:"+advance);
	    	//System.out.println("STATE:"+state);
	    	
	    	 
	    }
	    rs.close();
    	connection.close();
	    
	}
		
		}



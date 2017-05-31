package S11_30_5;
/*Question 1. Display all of the books showing their title, price, and
publication date.   Also list the revenue that has been made on each
book and give that column a heading of "Revenue".  Only show
books who have been given an advance of more than zero.  Put
the results in book title order.

SELECT title, price, pubdate, price * ytd_sales "Revenue"
	FROM book
	WHERE advance > 0
	ORDER BY title;

*/

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Assignment2_1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","venkatdb","oracle");
	    System.out.println("connection created succussfully....");
	    
	    Statement statement=connection.createStatement();
	    
	    String q1="SELECT title, price, pubdate, price*ytd_sales FROM book WHERE advance>0 ORDER BY title";
	    ResultSet rs=statement.executeQuery(q1);
	    
	    while(rs.next()){
	    
	    	String title=rs.getString(1);
	    	double price=rs.getDouble(2);
	    	Date pubdate=rs.getDate(3);
	    	double revenue=rs.getDouble(2)*rs.getInt(4);
	    	
	    	
	    	System.out.println(title);
	    	System.out.println(price);
	    	System.out.println(pubdate);
	    	System.out.println(revenue);
	    	
	    }
	    rs.close();
    	connection.close();
	    
	}
		
		}



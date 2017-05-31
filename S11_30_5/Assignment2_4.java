/*LESSON:    Restricting the Retrieving of Rows from a Table

You can restrict the number of rows shown
in a Result Set by specifying criteria in the
WHERE clause

Example...

  SELECT title, price
  FROM book
  WHERE price > 20;


This shows the title and price information for rows
where the price column has a value greater than $20.*/



package S11_30_5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.sql.Statement;

public class Assignment2_4 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","venkatdb","oracle");
	    System.out.println("connection created succussfully....");
	    
	    Statement statement=connection.createStatement();
	    
	    String q1="SELECT title, price FROM book WHERE price > 20";
	    ResultSet rs=statement.executeQuery(q1);
	    
	    while(rs.next()){
	    
	    	String title=rs.getString(1);
	    	int price=rs.getInt(2);
	    	//String state=rs.getString(3);
	
	    	System.out.println("TITLE:"+title);
	    	System.out.println("PRICE:"+price);
	    	//System.out.println("STATE:"+state);
	    	
	    	 
	    }
	    rs.close();
    	connection.close();
	    
	}
		
		}



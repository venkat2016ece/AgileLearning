package S11_30_5;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Assignment3_3 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","venkatdb","oracle");
	    System.out.println("connection created succussfully....");
	    
	    Statement statement=connection.createStatement();
	    
	    String q1="SELECT isbn, title, pubdate FROM book WHERE pubdate IS NULL";
	    ResultSet rs=statement.executeQuery(q1);
	    
	    while(rs.next()){
	    
	    	String isbn=rs.getString(1);
	    	String title=rs.getString(2);
	    	Date date=rs.getDate(3);
	    	
	    	
	    	System.out.println("isbn: "+isbn);
	    	System.out.println("TITLE: "+title);
	    	System.out.println("DATE: "+date);
	    	
	    }
	    rs.close();
    	connection.close();
	    
	}
		
		}




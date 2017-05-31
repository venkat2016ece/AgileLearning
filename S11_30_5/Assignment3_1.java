package S11_30_5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Assignment3_1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","venkatdb","oracle");
	    System.out.println("connection created succussfully....");
	    
	    Statement statement=connection.createStatement();
	    
	    String q1="SELECT title, price, advance FROM book WHERE (advance >= 10000 OR price > 30) OR price IS NULL ORDER BY 1";
	    ResultSet rs=statement.executeQuery(q1);
	    
	    while(rs.next()){
	    
	    	String title=rs.getString(1);
	    	int price =rs.getInt(2);
	    	int advance=rs.getInt(3);
	    	
	    	
	    	System.out.println(title);
	    	System.out.println(price);
	    	System.out.println(advance);
	    	
	    }
	    rs.close();
    	connection.close();
	    
	}
		
		}



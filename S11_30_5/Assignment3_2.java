package S11_30_5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Assignment3_2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","venkatdb","oracle");
	    System.out.println("connection created succussfully....");
	    
	    Statement statement=connection.createStatement();
	    
	    String q1="SELECT lastname, firstname, city, state FROM author WHERE (city = 'Oakland' AND state = 'CA') OR lastname = 'Singer'";
	    ResultSet rs=statement.executeQuery(q1);
	    
	    while(rs.next()){
	    
	    	String lastname=rs.getString(1);
	    	String firstname=rs.getString(2);
	    	String city=rs.getString(3);
	    	String state=rs.getString(4);
	    	
	    	
	    	System.out.println("Lname: "+lastname);
	    	System.out.println("Fname: "+firstname);
	    	System.out.println("City: "+city);
	    	System.out.println("State: "+state);
	    	
	    }
	    rs.close();
    	connection.close();
	    
	}
		
		}




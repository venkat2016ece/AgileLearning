package S11_30_5;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Assignment2_8 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","venkatdb","oracle");
	    System.out.println("connection created succussfully....");
	    
	    Statement statement=connection.createStatement();
	    
	    String q1="SELECT title,price * ytd_sales ,advance,((price * ytd_sales) - advance) FROM book";
	    ResultSet rs=statement.executeQuery(q1);
	    
	    while(rs.next()){
	    
	    	String title=rs.getString(1);
	    	double revenue=rs.getDouble(2);
	    	int advance =rs.getInt(3);
	    	double difference=rs.getDouble(2)*rs.getInt(4);
	    	
	    	
	    	System.out.println(title);
	    	System.out.println(revenue);
	    	System.out.println(advance);
	    	System.out.println(difference);
	    	
	    }
	    rs.close();
    	connection.close();
	    
	}
		
		}



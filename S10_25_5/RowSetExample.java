package S10_25_5;

import java.sql.SQLException;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class RowSetExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//creating and executing rowset
	JdbcRowSet rowSet=RowSetProvider.newFactory().createJdbcRowSet();
	rowSet.setUrl("jdbc:oracle:thin:@localhost:1521:xe");  
    rowSet.setUsername("venkatdb");  
    rowSet.setPassword("oracle");
    
    rowSet.setCommand("select *from user420");
    rowSet.execute();
    
    
    
    while(rowSet.next()){
    	//Generating cursor Moved event
    	
    	System.out.println("id:"+rowSet.getString(1));
    	System.out.println("name:"+rowSet.getString(2));
    	System.out.println("Salary:"+rowSet.getString(3));
    }
	
	}

}

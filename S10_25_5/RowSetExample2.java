package S10_25_5;

import java.sql.SQLException;

import javax.sql.RowSetEvent;
import javax.sql.RowSetListener;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class RowSetExample2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		
		//creating the Executing the  rowset
		JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();
		rowSet.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		rowSet.setUsername("venkatdb");
		rowSet.setPassword("oracle");
		
		
		rowSet.setCommand("select *from user420");
		rowSet.execute();
		
		//adding Listener and moving Rowset
		rowSet.addRowSetListener(new MyListener());
		
		while(rowSet.next()){
			//Generating cursor moved event
			System.out.println("id:"+rowSet.getString(1));
			System.out.println("Name:"+rowSet.getString(2));
			 System.out.println("Salary: " + rowSet.getString(3));  
		}
		
		
	}

}
 class MyListener implements RowSetListener {  
    public void cursorMoved(RowSetEvent event) {  
              System.out.println("Cursor Moved...");  
    }  
   public void rowChanged(RowSetEvent event) {  
              System.out.println("Cursor Changed...");  
   }  
   public void rowSetChanged(RowSetEvent event) {  
              System.out.println("RowSet changed...");  
   }  
}  

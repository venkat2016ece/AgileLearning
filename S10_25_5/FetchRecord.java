package S10_25_5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchRecord {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","VENKATDB","oracle");
		Statement stmnt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		ResultSet rs=stmnt.executeQuery("select *from  emp");
		
		
		//getting record of 3rd flow
		rs.absolute(3);
		System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
		con.close();
	}

}

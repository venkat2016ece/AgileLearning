package S10_25_5;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;


public class FuncSum {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","VENKATDB","oracle");
		
		CallableStatement stmt=con.prepareCall("{?=call sum4(?,?}");
		stmt.setInt(2,10);
		stmt.setInt(3,43);
		stmt.registerOutParameter(1,Types.INTEGER);
		stmt.execute();
		
		
		System.out.println(stmt.getInt(1));
	}

}

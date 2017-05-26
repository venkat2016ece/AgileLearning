package S10_25_5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchRecords {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","venkatdb","oracle");
	con.setAutoCommit(false);
	
	
	Statement stmt=con.createStatement();
	stmt.executeUpdate("insert into user420 values(190,'abhi')");
	stmt.executeUpdate("insert into user420 values(191,'umesh')");
	
	con.commit();
	con.close();
	System.out.println("success");
}
	}



package S11_30_5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class insertBookEditor {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","venkatdb","oracle");
		System.out.println("connection created successfully.........");
		connection.setAutoCommit(false);
		
		
		Statement statement=connection.createStatement();
		
		
		
		statement.executeUpdate("INSERT INTO bookeditor (editor_id, isbn) VALUES(0, 'ISBN')");
		statement.executeUpdate("INSERT INTO bookeditor (editor_id, isbn) VALUES(2, '1-1111-1111-x')");
		statement.executeUpdate("INSERT INTO bookeditor (editor_id, isbn) VALUES(2, '1-2091-2091-x')");
		statement.executeUpdate("INSERT INTO bookeditor (editor_id, isbn) VALUES(2, '1-2106-2106-x')");
		statement.executeUpdate("INSERT INTO bookeditor (editor_id, isbn) VALUES(3, '1-1372-1372-x')");
		statement.executeUpdate("INSERT INTO bookeditor (editor_id, isbn) VALUES(3, '1-3021-3021-x')");
		statement.executeUpdate("INSERT INTO bookeditor (editor_id, isbn) VALUES(3, '1-7832-7832-x')");
		statement.executeUpdate("INSERT INTO bookeditor (editor_id, isbn) VALUES(3, '1-8888-8888-x')");
		statement.executeUpdate("INSERT INTO bookeditor (editor_id, isbn) VALUES(5, '1-1032-1032-x')");
		statement.executeUpdate("INSERT INTO bookeditor (editor_id, isbn) VALUES(5, '1-1372-1372-x')");
		statement.executeUpdate("INSERT INTO bookeditor (editor_id, isbn) VALUES(5, '1-2222-2222-x')");
		statement.executeUpdate("INSERT INTO bookeditor (editor_id, isbn) VALUES(5, '1-3333-3333-x')");
		statement.executeUpdate("INSERT INTO bookeditor (editor_id, isbn) VALUES(5, '1-5555-5555-x')");
		statement.executeUpdate("INSERT INTO bookeditor (editor_id, isbn) VALUES(5, '1-9999-9999-x')");
		statement.executeUpdate("INSERT INTO bookeditor (editor_id, isbn) VALUES(7, '1-1111-1111-x')");
		statement.executeUpdate("INSERT INTO bookeditor (editor_id, isbn) VALUES(7, '1-2091-2091-x')");
		statement.executeUpdate("INSERT INTO bookeditor (editor_id, isbn) VALUES(7, '1-3218-3218-x')");
		statement.executeUpdate("INSERT INTO bookeditor (editor_id, isbn) VALUES(7, '1-7777-7777-x')");
		statement.executeUpdate("INSERT INTO bookeditor (editor_id, isbn) VALUES(8, '1-3021-3021-x')");
		statement.executeUpdate("INSERT INTO bookeditor (editor_id, isbn) VALUES(8, '1-4203-4203-x')");
		statement.executeUpdate("INSERT INTO bookeditor (editor_id, isbn) VALUES(8, '1-7777-7777-x')");
		statement.executeUpdate("INSERT INTO bookeditor (editor_id, isbn) VALUES(8, '1-8888-8888-x')");
		statement.executeUpdate("INSERT INTO bookeditor (editor_id, isbn) VALUES(9, '1-1032-1032-x')");
		statement.executeUpdate("INSERT INTO bookeditor (editor_id, isbn) VALUES(9, '1-1035-1035-x')");
		statement.executeUpdate("INSERT INTO bookeditor (editor_id, isbn) VALUES(9, '1-2075-2075-x')");
		statement.executeUpdate("INSERT INTO bookeditor (editor_id, isbn) VALUES(9, '1-7777-7777-x')");
		
		connection.commit();
		connection.close();
		System.out.println("successfull.......");
		 
	
		
		
	}

}

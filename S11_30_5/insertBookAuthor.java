package S11_30_5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class insertBookAuthor {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","venkatdb","oracle");
		connection.setAutoCommit(false);
		
		Statement statement=connection.createStatement();
		statement.executeUpdate("INSERT INTO bookauthor (author_id, isbn, author_order, royaltyshare) VALUES(409, '1-1032-1032-x', 1, '0.60')");
		statement.executeUpdate("INSERT INTO bookauthor (author_id, isbn, author_order, royaltyshare) VALUES(486, '1-5555-5555-x', 1, '1.00')");
		statement.executeUpdate("INSERT INTO bookauthor (author_id, isbn, author_order, royaltyshare) VALUES(486, '1-9999-9999-x', 1, '1.00')");
		statement.executeUpdate("INSERT INTO bookauthor (author_id, isbn, author_order, royaltyshare) VALUES(712, '1-2222-2222-x', 1, '1.00')");
		statement.executeUpdate("INSERT INTO bookauthor (author_id, isbn, author_order, royaltyshare) VALUES(172, '1-3333-3333-x', 1, '1.00')");
		statement.executeUpdate("INSERT INTO bookauthor (author_id, isbn, author_order, royaltyshare) VALUES(213, '1-1032-1032-x', 2, '0.40')");
		statement.executeUpdate("INSERT INTO bookauthor (author_id, isbn, author_order, royaltyshare) VALUES(238, '1-1035-1035-x', 1, '1.00')");
		statement.executeUpdate("INSERT INTO bookauthor (author_id, isbn, author_order, royaltyshare) VALUES(213, '1-2075-2075-x', 1, '1.00')");
		statement.executeUpdate("INSERT INTO bookauthor (author_id, isbn, author_order, royaltyshare) VALUES(998, '1-2091-2091-x', 1, '0.50')");
		statement.executeUpdate("INSERT INTO bookauthor (author_id, isbn, author_order, royaltyshare) VALUES(899, '1-2091-2091-x', 2, '0.50')");
		statement.executeUpdate("INSERT INTO bookauthor (author_id, isbn, author_order, royaltyshare) VALUES(998, '1-2106-2106-x', 1, '1.00')");
		statement.executeUpdate("INSERT INTO bookauthor (author_id, isbn, author_order, royaltyshare) VALUES(722, '1-3021-3021-x', 1, '0.75')");
		statement.executeUpdate("INSERT INTO bookauthor (author_id, isbn, author_order, royaltyshare) VALUES(899, '1-3021-3021-x', 2, '0.25')");
		statement.executeUpdate("INSERT INTO bookauthor (author_id, isbn, author_order, royaltyshare) VALUES(807, '1-3218-3218-x', 1, '1.00')");
		statement.executeUpdate("INSERT INTO bookauthor (author_id, isbn, author_order, royaltyshare) VALUES(274, '1-7832-7832-x', 1, '1.00')");
		statement.executeUpdate("INSERT INTO bookauthor (author_id, isbn, author_order, royaltyshare) VALUES(427, '1-8888-8888-x', 1, '0.50')");
		statement.executeUpdate("INSERT INTO bookauthor (author_id, isbn, author_order, royaltyshare) VALUES(846, '1-8888-8888-x', 2, '0.50')");
		statement.executeUpdate("INSERT INTO bookauthor (author_id, isbn, author_order, royaltyshare) VALUES(756, '1-1372-1372-x', 1, '0.75')");
		statement.executeUpdate("INSERT INTO bookauthor (author_id, isbn, author_order, royaltyshare) VALUES(728, '1-1372-1372-x', 2, '0.25')");
		statement.executeUpdate("INSERT INTO bookauthor (author_id, isbn, author_order, royaltyshare) VALUES(728, '1-1111-1111-x', 1, '0.60')");
		statement.executeUpdate("INSERT INTO bookauthor (author_id, isbn, author_order, royaltyshare) VALUES(267, '1-1111-1111-x', 2, '0.40')");
		statement.executeUpdate("INSERT INTO bookauthor (author_id, isbn, author_order, royaltyshare) VALUES(672, '1-7777-7777-x', 1, '0.40')");
		statement.executeUpdate("INSERT INTO bookauthor (author_id, isbn, author_order, royaltyshare) VALUES(267, '1-7777-7777-x', 2, '0.30')");
		statement.executeUpdate("INSERT INTO bookauthor (author_id, isbn, author_order, royaltyshare) VALUES(472, '1-7777-7777-x', 3, '0.30')");
		statement.executeUpdate("INSERT INTO bookauthor (author_id, isbn, author_order, royaltyshare) VALUES(648, '1-4203-4203-x', 1, '1.00')");
		
		
		connection.commit();
		connection.close();
		System.out.println("success..........");
		
	}

}

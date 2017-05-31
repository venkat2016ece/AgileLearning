package S11_30_5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class insertBook {

	public static void main(String[] args) throws ClassNotFoundException, Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","venkatdb","oracle");
		System.out.println("connection created successfully........");
		connection.setAutoCommit(false);
		
		
		
		Statement statement=connection.createStatement();
		statement.executeUpdate("INSERT INTO book (isbn, title, type, pub_id, price, advance, ytd_sales, pubdate) VALUES('1-8888-8888-x', 'Silicon Valley Start-ups', 'computer', '3', 40.00, 8000.00, 4095, TO_DATE ('12-JUN-12', 'DD-MON-YY'))");
		statement.executeUpdate("INSERT INTO book (isbn, title, type, pub_id, price, advance, ytd_sales, pubdate) VALUES('1-1032-1032-x', 'One Hour Negotiations', 'business', '3', 29.99, 5000.00, 4095, TO_DATE ('12-JUN-12', 'DD-MON-YY'))");
		statement.executeUpdate("INSERT INTO book (isbn, title, type, pub_id, price, advance, ytd_sales, pubdate) VALUES('1-3333-3333-x', 'Analyzing the Obsessive', 'psychology', '1', 29.99, 2000.00, 4072, TO_DATE ('12-JUN-12', 'DD-MON-YY'))");
		statement.executeUpdate("INSERT INTO book (isbn, title, type, pub_id, price, advance, ytd_sales, pubdate) VALUES('1-1111-1111-x', 'Where is my Break-Even Point?', 'business', '3', 21.95, 5000.00, 3876, TO_DATE ('09-JUN-12', 'DD-MON-YY'))");
		statement.executeUpdate("INSERT INTO book (isbn, title, type, pub_id, price, advance, ytd_sales, pubdate) VALUES('1-2222-2222-x', 'Treats and More Treats', 'cooking', '2', 29.99 , 0.00, 2032, TO_DATE ('09-JUN-12', 'DD-MON-YY'))");
		statement.executeUpdate("INSERT INTO book (isbn, title, type, pub_id, price, advance, ytd_sales, pubdate) VALUES('1-7777-7777-x', 'Gluten Free or Die', 'cooking', '2', 29.99, 8000.00, 4095, TO_DATE ('12-JUN-12', 'DD-MON-YY'))");
		statement.executeUpdate("INSERT INTO book (isbn, title, type, pub_id, price, advance, ytd_sales, pubdate) VALUES('1-4203-4203-x', 'Twenty Meals you can make in 20 minutes', 'cooking', '2', 21.95, 4000.00, 15096, TO_DATE ('12-JUN-12','DD-MON-YY'))");
		statement.executeUpdate("INSERT INTO book (isbn, title, type, pub_id, price, advance, ytd_sales, pubdate) VALUES('1-1035-1035-x', 'Usability Testing', 'computer', '3', 42.95, 7000.00, 8780, TO_DATE ('30-JUN-12', 'DD-MON-YY'))");
		statement.executeUpdate("INSERT INTO book (isbn, title, type, pub_id, price, advance, ytd_sales, pubdate) VALUES('1-2075-2075-x', 'Are You Stressed for Success?', 'business', '1', 12.99, 10125.00, 18722, TO_DATE ('15-JUN-12', 'DD-MON-YY'))");
		statement.executeUpdate("INSERT INTO book (isbn, title, type, pub_id, price, advance, ytd_sales, pubdate) VALUES('1-2091-2091-x', 'Sleep Depreviation and Mood Therapy', 'psychology', '1', 21.95, 2275.00, 2045, TO_DATE ('15-JUN-12', 'DD-MON-YY'))");
		statement.executeUpdate("INSERT INTO book (isbn, title, type, pub_id, price, advance, ytd_sales, pubdate) VALUES('1-2106-2106-x', 'Instilling Courage', 'psychology', '1', 17.00, 6000.00, 111, TO_DATE ('05-OCT-12', 'DD-MON-YY'))");
		statement.executeUpdate("INSERT INTO book (isbn, title, type, pub_id, price, advance, ytd_sales, pubdate) VALUES('1-3021-3021-x', 'Fresh and Easy?', 'cooking', '2', 12.99, 15000.00, 22246, TO_DATE ('18-JUN-12', 'DD-MON-YY'))");
		statement.executeUpdate("INSERT INTO book (isbn, title, type, pub_id, price, advance, ytd_sales, pubdate) VALUES('1-3218-3218-x', 'Stop and Smell the Humus', 'cooking', '2', 40.95, 7000.00, 375, TO_DATE ('21-OCT-12', 'DD-MON-YY'))");
		statement.executeUpdate("INSERT INTO book (isbn, title, type, pub_id, price, advance, ytd_sales, pubdate) VALUES('1-3026-3026-x', 'The Psychology of Social Networking', NULL, '2', NULL, NULL, NULL, NULL)");
		statement.executeUpdate("INSERT INTO book (isbn, title, type, pub_id, price, advance, ytd_sales, pubdate) VALUES('1-7832-7832-x', 'How to Choose a Computer', 'business', '3', 29.99, 5000.00, 4095, TO_DATE ('22-JUN-12', 'DD-MON-YY'))");
		statement.executeUpdate("INSERT INTO book (isbn, title, type, pub_id, price, advance, ytd_sales, pubdate) VALUES('1-1372-1372-x', 'Dealing with Behavior Problems in the Workplace', 'psychology', '1', 41.59, 7000.00, 375, TO_DATE ('21-OCT-12','DD-MON-YY'))");
		
		
		connection.commit();
		connection.close();
		System.out.println("success.....");
		
	}

}

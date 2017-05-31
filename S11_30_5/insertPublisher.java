package S11_30_5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class insertPublisher {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
			//load class
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//java-db
			Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","venkatdb","oracle");
			
			connection.setAutoCommit(false);
			
			
			Statement statement=connection.createStatement();
			
			statement.executeUpdate("INSERT INTO publisher (pub_id, name, address, city, state) VALUES(2, 'Binder and Smith', '2 2nd Ave.', 'New York', 'NY')");
			statement.executeUpdate("INSERT INTO publisher (pub_id, name, address, city, state) VALUES(3, 'All Techo Books', '3 3rd Dr.', 'Cupertino', 'CA')");
			statement.executeUpdate("INSERT INTO publisher (pub_id, name, address, city, state) VALUES(1, 'Sunshine Publishers', '1 1st St', 'Berkeley', 'CA')");
			
			connection.commit();
			connection.close();
			System.out.println("success");
			
			
			
		}

	}

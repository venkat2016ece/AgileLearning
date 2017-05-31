package S11_30_5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class insertEditor {

		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			//load class
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//java-db
			Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","venkatdb","oracle");
			
			connection.setAutoCommit(false);
			
			
			Statement statement=connection.createStatement();
			
			statement.executeUpdate("INSERT INTO editor (editor_id, ssn, lastname, firstname, phone, editor_position, salary) VALUES(5, '955-72-3567', 'Penny', 'Anne', '801 826-0752', 'Managing Editor', '108000.00')");
			statement.executeUpdate("INSERT INTO editor (editor_id, ssn, lastname, firstname, phone, editor_position, salary) VALUES(9, '888-46-2035', 'Jones', 'Albert', '801 826-0752', 'Copy Editor', '77000.00')");
			statement.executeUpdate("INSERT INTO editor (editor_id, ssn, lastname, firstname, phone, editor_position, salary) VALUES(2, '722-51-5454', 'Lance', 'Mike', '219 547-9982', 'Project Editor', '88000.00')");
			statement.executeUpdate("INSERT INTO editor (editor_id, ssn, lastname, firstname, phone, editor_position, salary) VALUES(7, '807-91-6654', 'Parry', 'Sylvia', '301 946-8853', 'Managing Editor', '105000.00')");
			statement.executeUpdate("INSERT INTO editor (editor_id, ssn, lastname, firstname, phone, editor_position, salary) VALUES(3, '793-72-1158', 'Smith', 'Steve', '707 448-4982', 'Copy Editor', '76000.00')");
			statement.executeUpdate("INSERT INTO editor (editor_id, ssn, lastname, firstname, phone, editor_position, salary) VALUES(8, '714-80-9391', 'MacDonald', 'Ron', '415 354-7128', 'Project Editor', '87000.00')");
			
			connection.commit();
			connection.close();
			System.out.println("success");
			
			
			
		}

	}

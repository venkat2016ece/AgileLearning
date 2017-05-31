package S11_30_5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class insertAuthor {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","venkatdb","oracle");
		connection.setAutoCommit(false);
		
		
		Statement statement=connection.createStatement();
		statement.executeUpdate("insert into author values(998, '998-72-3567', 'Singer', 'Albert','801 826-0752', '123 3rd Street', 'St. George', 'UT', '84152')");
		statement.executeUpdate("insert into author values(899, '899-46-2035', 'Singer', 'Anne','801 826-0752', '123 3rd Street', 'St. George', 'UT', '84152')");
		statement.executeUpdate("insert into author values(722, '722-51-5454', 'Lance', 'Mike','219 547-9982', '3 Bald Eagle Drive', 'Chicago', 'IL', '60631')");
		statement.executeUpdate("insert into author values(807, '807-91-6654', 'Parry', 'Sylvia','301 946-8853', '19 Main Street', 'Rockville', 'MD', '20853')");
		statement.executeUpdate("insert into author values(893, '893-72-1158', 'McCluck', 'Serge','707 448-4982', '1 Fizzy Street', 'Anaheim', 'CA', '95688')");
		statement.executeUpdate("insert into author values(728, '724-80-9391', 'MacDouglas', 'Spencer','415 354-7128', '47 Cumbre Ct.', 'Oakland', 'CA', '94612')");
		statement.executeUpdate("insert into author values(427, '427-17-2319', 'Dingy', 'Ann','415 836-7128', '3410 RedWing St.', 'Santa Clara', 'CA', '94301')");
		statement.executeUpdate("insert into author values(672, '672-71-3249', 'Suko', 'Ahi', '415 935-4228', '3 Silver Ct.', 'Walnut Creek', 'CA', '94595')");
		statement.executeUpdate("insert into author values(267, '267-41-2394', 'Farhey', 'Michael', '408 286-2428', '44 Homestead Pkwy', 'San Jose', 'CA', '95128')");
		statement.executeUpdate("insert into author values(472, '472-27-2349', 'Dunhill', 'Curt', '707 938-6445', 'PO Box 792', 'Santa Clara', 'CA', '94301')");
		statement.executeUpdate("insert into author values(527, '527-72-3246', 'Blue', 'Robert', '615 297-2723', '22 Cowboy Rd.', 'Nashville', 'TN', '37215')");
		statement.executeUpdate("insert into author values(172, '172-32-1176', 'Black', 'John', '408 496-7223', '10932 Bigge Rd.', 'Menlo Park', 'CA', '94025')");
		statement.executeUpdate("insert into author values(724, '724-08-9931', 'McGyver', 'Dirk','415 843-2991', '752 Telescope Rd.', 'Oakland', 'CA', '94609')");
		statement.executeUpdate("insert into author values(274, '274-80-9391', 'Straight', 'Richard','415 834-2919', '5420 University Av.', 'Oakland', 'CA', '94609')");
		statement.executeUpdate("insert into author values(756, '756-30-7391', 'Karsen', 'Lynda','415 534-9219', '72 James St.', 'Oakland', 'CA', '94609')");
		statement.executeUpdate("insert into author values(712, '712-45-1867', 'Castillo', 'Jose', '615 996-8275', '28 Park Pl. #86', 'Ann Arbor', 'MI', '48105')");
		statement.executeUpdate("insert into author values(846, '846-92-7186', 'Hunter', 'Cindy','415 836-7128', '41 Smart St.', 'Palo Alto', 'CA', '94301')");
		statement.executeUpdate("insert into author values(486, '486-29-1786', 'Lockley', 'Sharon','415 585-4620', '18 Brooklyn Av.', 'San Francisco', 'CA', '94130')");
		statement.executeUpdate("insert into author values(648, '648-92-1872', 'Hall', 'Mark','503 745-6402', '55 Valley Blvd.', 'Corvallis', 'OR', '97330')");
		statement.executeUpdate("insert into author values(341, '341-22-1782', 'Smith', 'Marge','913 843-0462', '10 Misisipi Dr.', 'Lawrence', 'KS', '66044')");
		statement.executeUpdate("insert into author values(409, '409-56-7008', 'Adams', 'Abraham','415 658-9932', '622 Robin St.', 'Berkeley', 'CA', '94705')");
		statement.executeUpdate("insert into author values (213, '213-46-8915', 'Blue', 'Maggie','415 986-7020', '397 83rd St. #431', 'Oakland', 'CA', '94618')");
		statement.executeUpdate("insert into author values(238, '238-95-7766', 'Carson', 'Honey','415 548-7723', '89 MLK Blvd.', 'Berkeley', 'CA', '94705')");
		
		
		connection.commit();
		connection.close();
		System.out.println("success.......");
	}

}

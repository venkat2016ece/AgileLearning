package S5_21_4;
import java.sql.*;

	public class ConnectToH2 {

		/**
		 * @param args
		 */
		public static void main(String[] args) {
		// TODO Auto-generated method stub

		// JDBC driver name and database URL
		final String JDBC_DRIVER = "org.h2.Driver";
		final String DB_URL = "jdbc:h2:tcp://localhost/~/test2";

		// Database credentials
		final String USER = "sa";
		final String PASS = "";

			Connection conn = null;
			Statement stmt = null;
			try {
				// STEP 2: Register JDBC driver
				Class.forName(JDBC_DRIVER);

				// STEP 3: Open a connection
				System.out.println("Connecting to database...");
				conn = DriverManager.getConnection(DB_URL, USER, PASS);

				// STEP 4: Execute a query
				System.out.println("Creating statement...");
				stmt = conn.createStatement();
				String sql;
				sql = "SELECT id,password FROM TEST";
				ResultSet rs = stmt.executeQuery(sql);

				// STEP 5: Extract data from result set
				while (rs.next()) {
					// Retrieve by column name
					String first = rs.getString("id");
					String last = rs.getString("password");

					// Display values
					System.out.print("Id: " + first);
					System.out.println(",Password: " + last);
				}
				// STEP 6: Clean-up environment
				rs.close();
				stmt.close();
				conn.close();
			} catch (SQLException se) {
				// Handle errors for JDBC
				se.printStackTrace();
			} catch (Exception e) {
				// Handle errors for Class.forName
				e.printStackTrace();
			} finally {
				// finally block used to close resources
				try {
					if (stmt != null)
						stmt.close();
				} catch (SQLException se2) {
				} // nothing we can do
				try {
					if (conn != null)
						conn.close();
				} catch (SQLException se) {
					se.printStackTrace();
				} // end finally try
			} // end try
			System.out.println("Goodbye!");
		}// end main
		
	}

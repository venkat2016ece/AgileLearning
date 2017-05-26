package S10_25_5;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertImage {  
		public static void main(String[] args) {  
		try{  
		Class.forName("oracle.jdbc.driver.OracleDriver");  
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","venkatdb","oracle");  
		              
		PreparedStatement ps=con.prepareStatement("insert into imgtable values(?,?)");  
		ps.setString(1,"sonoo");  
		  
		FileInputStream fin=new FileInputStream("C:\\Users\\welcome\\Desktop\\dp\\371.jpg");  
		ps.setBinaryStream(2,fin,fin.available());  
		int i=ps.executeUpdate();  
		System.out.println(i+" records affected");  
		          
		con.close();  
		}catch (Exception e) {e.printStackTrace();}  
		}  
		}  


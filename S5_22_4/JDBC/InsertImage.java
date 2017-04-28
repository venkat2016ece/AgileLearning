package S5_22_4.JDBC;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertImage {
	public static void main(String[] args) {  
		try{  
		Class.forName("org.h2.Driver");  
		Connection con=DriverManager.getConnection(  
				"jdbc:h2:tcp://localhost/~/test2","sa","");  
		              
		PreparedStatement ps=con.prepareStatement("insert into imgtable values(?,?)");  
		ps.setString(1,"venkat");  
		  
		FileInputStream fin=new FileInputStream("F:\\clg images\\image3.jpg");  
		ps.setBinaryStream(2,fin,fin.available());  
		int i=ps.executeUpdate();  
		System.out.println(i+" records affected");  
		          
		con.close();  
		}catch (Exception e) {e.printStackTrace();}  
		}  
		}  


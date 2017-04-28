package S5_22_4.JDBC;

import java.io.FileWriter;
import java.io.Reader;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RetrieveFile {
	public static void main(String[] args) {  
		try{  
		Class.forName("org.h2.Driver");  
		Connection con=DriverManager.getConnection(  
				"jdbc:h2:tcp://localhost/~/test2","sa","");  
		              
		PreparedStatement ps=con.prepareStatement("select * from filetable");  
		ResultSet rs=ps.executeQuery();  
		rs.next();//now on 1st row  
		              
		Clob c=rs.getClob(2);  
		Reader r=c.getCharacterStream();              
		              
		FileWriter fw=new FileWriter("G:\\StringDemo1.txt");  
		              
		int i;  
		while((i=r.read())!=-1)  
		fw.write((char)i);  
		              
		fw.close();  
		con.close();  
		              
		System.out.println("success");  
		}catch (Exception e) {e.printStackTrace();  }  
		}  
		}  
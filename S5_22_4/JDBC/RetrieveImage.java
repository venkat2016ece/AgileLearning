package S5_22_4.JDBC;

import java.io.FileOutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RetrieveImage {

	public static void main(String[] args) {  
		try{  
		Class.forName("org.h2.Driver");  
		Connection con=DriverManager.getConnection(  
				"jdbc:h2:tcp://localhost/~/test2","sa","");  
		      
		PreparedStatement ps=con.prepareStatement("select * from imgtable where name='venkat'");  
		ResultSet rs=ps.executeQuery();  
		if(rs.next()){//now on 1st row  
		              
		Blob b=rs.getBlob(2);//2 means 2nd column data  
		byte barr[]=b.getBytes(1,(int)b.length());//1 means first image  
		              
		FileOutputStream fout=new FileOutputStream("F:\\clg images\\venkat.jpg");  
		fout.write(barr);  
		              
		fout.close();  
		}//end of if  
		System.out.println("ok");  
		              
		con.close();  
		}catch (Exception e) {e.printStackTrace();  }  
		}  
		}  

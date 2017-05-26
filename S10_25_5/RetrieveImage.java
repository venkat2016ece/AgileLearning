package S10_25_5;

import java.io.FileOutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RetrieveImage {

	public static void main(String[] args) {
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","VENKATDB","oracle");
			
			
			PreparedStatement ps=con.prepareStatement("select *from imgtable");
			ResultSet rs=ps.executeQuery();
			if(rs.next()){//now in first row
				
				
				Blob b=rs.getBlob(2);
				byte barr[]=b.getBytes(1,(int)b.length());
				
				
				FileOutputStream fout=new FileOutputStream("D:\\ANN\\1.jpg");
				fout.write(barr);
				
				fout.close();
				System.out.println("ok");
				con.close();
			}
		}catch(Exception e){e.printStackTrace();}
	}
}

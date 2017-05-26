package S10_25_5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class BP {
	public static void main(String[] args) {
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","venkatdb","oracle");
			
			
			PreparedStatement ps=con.prepareStatement("insert into user420 values(?,?,?)");
			
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			while(true){
				System.out.println("enter id");
				String s1=br.readLine();
		        int id=Integer.parseInt(s1);
		        
		        System.out.println("enter name");
		        String name=br.readLine();
		        
		        System.out.println("enter salary");
		        String s3=br.readLine();
		        int salary=Integer.parseInt(s3);
		        
		        ps.setInt(1, id);
		        ps.setString(2, name);
		        ps.setInt(3, salary);
		        
		        
		        ps.addBatch();
		        
		        System.out.println("want to  add more records y/n");
		        String ans=br.readLine();
		        if(ans.equals("n")){
		        	break;
		        }
			}
			ps.executeBatch();
			System.out.println("records successfully saved");
			
			con.close();
		}catch(Exception e){}
	}

}

package S10_25_5;

import java.sql.*;  
class InsertPrepared{  
public static void main(String args[]){  
try{  
Class.forName("oracle.jdbc.driver.OracleDriver");  
  
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","VENKATDB","oracle");  
  
PreparedStatement stmt=con.prepareStatement("insert into Emp1 values(?,?)");  
stmt.setInt(1,101);//1 specifies the first parameter in the query  
stmt.setString(2,"Ratan");  
  
int i=stmt.executeUpdate();  
System.out.println(i+" records inserted"); 



PreparedStatement stmt2=con.prepareStatement("update emp1 set name=? where id=?");  
stmt2.setString(1,"Sonoo");//1 specifies the first parameter in the query i.e. name  
stmt2.setInt(2,101);  
  
int i2=stmt2.executeUpdate();  
System.out.println(i2+" records updated"); 


PreparedStatement stmt3=con.prepareStatement("delete from emp1 where id=?");  
stmt3.setInt(1,101);  
  
int i3=stmt3.executeUpdate();  
System.out.println(i3+" records deleted");



PreparedStatement stmt4=con.prepareStatement("select *from emp1");  
ResultSet rs=stmt4.executeQuery();  
while(rs.next()){  
System.out.println(rs.getInt(1)+" "+rs.getString(2));  
}  
  
con.close();  
  
}catch(Exception e){ System.out.println(e);}  
  
}  
}  

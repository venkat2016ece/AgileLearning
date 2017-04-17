package S5_17_4.Map.Properties;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class PropertiesDemo2 {

	public static void main(String[] args) throws Exception {
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream("D:\\javaprograms\\Core_Java\\abc.properties.txt");
		p.load(fis);
		String url=p.getProperty("url");
		String user=p.getProperty("user");
		String pwd=p.getProperty("pwd");
		Connection con=DriverManager.getConnection(url,user,pwd);
		;;;;;;;;;;
	}

}

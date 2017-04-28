package S6_26_4.Collections.SortingMechanisams.SynchronizedVersions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {

	public static void main(String[] args) throws IOException {
		//Step1:read the location of the properties
		FileInputStream fis=new FileInputStream("abc.properties");
		//load the properties --->using properties class load.
		Properties p =new Properties();
		p.load(fis);
		
		//get the data from the properties file
		String uname=p.getProperty("username");
		String upswd=p.getProperty("password");
		
		//use the data in the project
		System.out.println(uname);
		System.out.println(upswd);
	}

}

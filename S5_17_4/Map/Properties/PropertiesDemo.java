package S5_17_4.Map.Properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws Exception {
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream("D:\\javaprograms\\Core_Java\\abc.properties.txt");
		p.load(fis);
		System.out.println(p);
		String s=p.getProperty("Venky");
		System.out.println(s);
		p.setProperty("nag", "88888");
		FileOutputStream fos=new FileOutputStream("D:\\javaprograms\\Core_Java\\abc.properties.txt");
		p.store(fos, "updated by venkat");
	}

}

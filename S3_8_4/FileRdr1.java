package S3_8_4;

import java.io.File;
import java.io.FileReader;

public class FileRdr1 {

	public static void main(String[] args) throws Exception {
		File f=new File("abcd.txt");
		char[] ch=new char[(int)f.length()];
		FileReader fr=new FileReader(f);
		fr.read(ch);
		for(char ch1:ch){
			System.out.println(ch1);
			
		}
		fr.close();
}
}

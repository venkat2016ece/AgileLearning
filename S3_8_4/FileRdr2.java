package S3_8_4;

import java.io.File;
import java.io.FileReader;

public class FileRdr2 {

	public static void main(String[] args) throws Exception {
		FileReader fr=new FileReader("abcd.txt");
		int i=fr.read();
		while(i!=-1){
			System.out.println((char)i);
			i=fr.read();
			
		}
		fr.close();
		System.out.println("==========================");
		File f=new File("abcd.txt");
		char[] ch=new char[(int)f.length()];
		FileReader fr1=new FileReader(f);
		fr1.read(ch);
		for(char ch2:ch){
			System.out.println((char)ch2);
		}
		 fr.close();
	}
	 

}

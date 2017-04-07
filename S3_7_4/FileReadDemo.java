package S3_7_4;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReadDemo {

	public static void main(String[] args)throws IOException {
		File f=new File("G:\\StringDemo1.txt");
		char[] ch=new char[(int)f.length()];
		FileReader fr=new FileReader("G:\\StringDemo1.txt");
		fr.read(ch);
		for(char ch1:ch){
			System.out.print(ch1);
		 fr.close();
		}
	}
	

}

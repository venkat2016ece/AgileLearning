package S3_7_4;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo1 {

	public static void main(String[] args)throws IOException {
		FileReader fr=new FileReader("FileWriter.txt");
		int i=fr.read();
		while(i!=-1)
		{
			System.out.println((char)i);
			i=fr.read();
		}
	}

}

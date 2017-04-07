package S3_7_4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

	public static void main(String[] args)throws IOException {
		FileReader fr=new FileReader("abc.txt");
		BufferedReader br=new BufferedReader(fr);
		String line=br.readLine();
		while(line!=null){
			System.out.println(line);
			line=br.readLine();
		}
		br.close();
	}

}

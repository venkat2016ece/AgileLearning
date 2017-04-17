package S3_8_4;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedRdr {

	public static void main(String[] args) throws Exception {
		FileReader fr=new FileReader("abcd.txt");
		BufferedReader br=new BufferedReader(fr);
		String line=br.readLine();
		while(line!=null){
			System.out.println(line);
			line=br.readLine();
		}
		br.close();
	}

}

package S3_7_4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test3 {
	public static void main(String[] args) {
		BufferedReader br=null;
		String line;
		try {
			br=new BufferedReader(new FileReader("example.txt"));
			while((line=br.readLine())!=null){
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		 
	}

}


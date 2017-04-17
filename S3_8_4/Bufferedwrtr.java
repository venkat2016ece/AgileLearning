package S3_8_4;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Bufferedwrtr {

	public static void main(String[] args) throws Exception{
			FileWriter fr=new FileWriter("bufferedwrtr.txt");
			BufferedWriter br=new BufferedWriter(fr);
			br.write(118);
			br.newLine();
			char[] ch={'a','b','c','d'};
			br.write(ch);
			br.newLine();
			br.write("venkat software solutions");
			br.flush();
			br.close();
	}

}

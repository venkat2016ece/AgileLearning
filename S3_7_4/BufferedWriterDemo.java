package S3_7_4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("abc.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write(100);
		bw.newLine();
		char[] ch1={'a','b','c','d'};
		bw.write(ch1);
		bw.newLine();
		bw.write("venkat");
		bw.newLine();
		bw.write("software solutions");
		bw.flush();
		bw.close();

	}

}

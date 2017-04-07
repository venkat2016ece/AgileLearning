package S3_7_4;

import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {
	public static void main(String[] args) throws IOException {
		PrintWriter pw=new PrintWriter("abc.txt");
		pw.write(100);
		pw.println(100);
		pw.println(true);
		pw.println('c');
		pw.println("venkat");
		pw.flush();
		pw.close();
	}

}

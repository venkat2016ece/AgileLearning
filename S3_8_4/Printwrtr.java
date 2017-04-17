package S3_8_4;

import java.io.IOException;
import java.io.PrintWriter;

public class Printwrtr {

	public static void main(String[] args)throws IOException {
		PrintWriter pw=new PrintWriter("prnt.txt");
		pw.write(100);
		pw.println(100);
		pw.println("true");
		pw.println('c');
		pw.println("venkat");
		pw.flush();
		pw.close();
	}

}

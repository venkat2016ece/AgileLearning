package S3_7_4;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException{
		FileWriter fw=new FileWriter("FileWriter.txt",true);
		fw.write(118);//adding a single character
		fw.write("enkat\nsoftware solutions");
		fw.write("\n");
		char[] ch1={'a','b','c','d'};
		fw.write("\n");
		fw.flush();
		fw.close();
	}

}

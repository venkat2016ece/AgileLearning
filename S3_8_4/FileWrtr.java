package S3_8_4;

import java.io.FileWriter;

public class FileWrtr {

	public static void main(String[] args) throws Exception{
		FileWriter fw=new FileWriter("abcd.txt",true);
		fw.write(118);
		fw.write("enkat\nsoftware solutions");
		char[] ch={'a','b','c','d'};
		fw.write("\n");
		fw.flush();
		fw.close();
	}

}

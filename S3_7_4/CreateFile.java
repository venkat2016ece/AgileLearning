package S3_7_4;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) throws IOException {
       File f=new File("abc2017.txt");
       System.out.println(f.exists());
       f.createNewFile();
       System.out.println(f.exists());
	}

}

package S3_7_4;

import java.io.File;

public class Createdir {
	public static void main(String[] args) {
		File f=new File("venkat123");
		System.out.println(f.exists());
		f.mkdir();
		System.out.println(f.exists());
	}

}

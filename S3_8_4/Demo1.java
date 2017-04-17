package S3_8_4;

import java.io.File;

public class Demo1 {

	public static void main(String[] args) {
		int count=0;
		File f1=new File("C:\\");
		String [] s=f1.list();
		for(String s1:s){
			count++;
			System.out.println(s1);
			System.out.println("total number files"+count);
		}
	}
	

}

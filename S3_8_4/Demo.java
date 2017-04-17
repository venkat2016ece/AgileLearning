package S3_8_4;

import java.io.File;

public class Demo {

	public static void main(String[] args) {
		int count=0;
		File f=new File("C:\\");
		String[] s= f.list();
		for(String s1:s){
			File f1=new File(f,s1);
			if(f1.isDirectory()){
				count++;
				System.out.println(s1);
				System.out.println("total dir:"+count);
			}
		}
		
	}

}

package S3_7_4;

import java.io.File;

public class DisplayFIilesAndDir {

	public static void main(String[] args) {
		int count=0;
       File f =new File("C:\\");
       String[] s=f.list();
       for(String s1:s){
    	   count++;
    	   System.out.println(s1);
       }
       System.out.println("The total number:"+count);
	}

}

package S3_7_4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		File fileName=new File("F:\\ArrayEx.java");
		Scanner scan=null;
		try{
		 scan=new Scanner(fileName);
		while(scan.hasNextLine()){
			System.out.println(scan.nextLine());
		}
	}catch(FileNotFoundException e){
		e.printStackTrace();
	}
	}

}

package S3_7_4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Test1 {
	public static void main(String[] args) {
		String fileName="10lines.txt";
		PrintWriter writer=null;
		try{
		 writer=new PrintWriter(fileName);
	}catch(FileNotFoundException e){
		e.printStackTrace();
	}
		for(int count=1;count<=10;count++){
			writer.println("line"+count);
		}
		writer.close();
	}

}

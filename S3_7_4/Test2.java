package S3_7_4;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Test2 {
	public static void main(String[] args) {
		String fileName="10lines.txt";
		PrintWriter writer=null;
		try{
			FileWriter fw=new FileWriter(fileName,true);
		 writer=new PrintWriter(fw);
	}catch(FileNotFoundException  e){
		e.printStackTrace();
	}catch( IOException e){
		e.printStackTrace();
	}
			writer.println("-------Added file--------");
		for(int count=1;count<=10;count++){
			writer.println("line"+(count+10));
		}
		writer.close();
	}

}

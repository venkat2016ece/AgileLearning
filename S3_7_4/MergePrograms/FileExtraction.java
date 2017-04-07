package S3_7_4.MergePrograms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

//write a program File Extraction Operation
public class FileExtraction {

	public static void main(String[] args)throws Exception {
		PrintWriter pw=new PrintWriter("output.txt");
		BufferedReader br1=new BufferedReader(new FileReader("input.txt"));
		String line=br1.readLine();
		while(line!=null)
		{
			boolean available=false;;
			BufferedReader br2=new BufferedReader(new FileReader("delete.txt"));
			String target=br2.readLine();
			while(target!=null){
				if(line.equals(target)){
					available=true;
					break;
				}
				target=br2.readLine();
			}
			if(available==false){
				pw.println(line);
			}
			line=br1.readLine();
		}
		pw.flush();
	}

}

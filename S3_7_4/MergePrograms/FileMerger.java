package S3_7_4.MergePrograms;
//write a program to Merge data from 2 files into a 3rd file 
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class FileMerger {
	public static void main(String[] args) throws Exception{
	PrintWriter pw=new PrintWriter("file3.txt");
	BufferedReader br=new BufferedReader(new FileReader("file1.txt"));
	String line=br.readLine();
	while(line!=null){
		pw.println(line);
		line=br.readLine();
	}
	br=new BufferedReader(new FileReader("file2.txt"));
	line=br.readLine();
	while(line!=null){
		pw.println(line);
		line=br.readLine();
		
	}
	pw.flush();
	pw.close();
	pw.close();

	}

}

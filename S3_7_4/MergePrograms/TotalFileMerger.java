package S3_7_4.MergePrograms;
//write a progarm to merge Data from all.txt files present 
//in D:\\javaprograms\\Core_Java\\XYZ into output.txt.
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;

public class TotalFileMerger {

	public static void main(String[] args) throws Exception {
		PrintWriter pw=new PrintWriter("output.txt");
		File f=new File("D:\\javaprograms\\Core_Java\\XYZ");
		String [] s=f.list();
		for(String s1:s)
		{
			File f1=new File(f,s1);
			BufferedReader br=new BufferedReader(new FileReader(f1));
			String line=br.readLine();
			while(line!=null){
				pw.println(line);
				line=br.readLine();
			}
			pw.flush();
			
			
		}
	}

}

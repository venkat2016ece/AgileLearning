package S3_8_4;

import java.io.FileReader;

public class FileRdr {

	public static void main(String[] args) throws Exception{
		 FileReader fr=new FileReader("abcd.txt");
		 int i=fr.read();
		 while(i!=-1){
			 System.out.println((char)i);
			 i=fr.read();
		 }
		 fr.close();

}
}

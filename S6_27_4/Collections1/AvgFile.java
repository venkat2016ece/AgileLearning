package S6_27_4.Collections1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
public class AvgFile {

	public static void main(String[] args) throws FileNotFoundException {
		int count=0;
		double sum=0.0;
		FileReader fileReader=new FileReader("");
		try(Scanner scanner=new Scanner(fileReader)){
			while(scanner.hasNext()){
				if(scanner.hasNextDouble()){
					sum+=scanner.nextDouble();
					count++;
				}else{
					String string=scanner.next();
					if(string.equals("finished"))
						break;
					else {
						System.out.println("Date Format Error");
						return;
					}
				}
			}
		}System.out.println("the mean is:"+sum/count);
	}

}

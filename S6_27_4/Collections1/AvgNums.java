package S6_27_4.Collections1;

import java.util.Scanner;

public class AvgNums {

	public static void main(String[] args) {
		Scanner conin=new Scanner(System.in);
		int count=0;
		double sum=0.0;
		System.out.println("Enters number to medium.");
		while(conin.hasNext()){
			if(conin.hasNextDouble()){
				sum+=conin.nextDouble();
				count++;
			}
			else{
				String str=conin.next();
				if(str.equals("finished"));
				break;
				
				else {
					System.out.println("Data format error");
					return;
				} 
			}
		}
		conin.close();
		System.out.println("the mean is:"+sum/count);
	}

}

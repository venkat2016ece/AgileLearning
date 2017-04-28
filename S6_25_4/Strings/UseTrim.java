package S6_25_4.Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UseTrim {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str;
		
		System.out.println("stop mean Exit");
		System.out.println("Enter the name of the province: ");
		
		do{
			str=br.readLine();
			str=str.trim();
			
			if(str.equals("Oh...skie"))System.out.println("Katowice");
			if(str.equals("mazowieckie"))System.out.println("Warzawa");
			if(str.equals("malopolskie"))System.out.println("Krakow");
			if(str.equals("opolskie"))System.out.println("Opole");
		}while(!str.equals("stop"));
		
	}

}

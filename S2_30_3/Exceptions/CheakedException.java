package S2_30_3.Exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheakedException {

	public static void main(String[] args) {
		int i,j=0,k=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		i=8;
		try{
			System.out.println("Enter a number");
			j=Integer.parseInt(br.readLine());
			k=i/j;
			System.out.println(k);
		}catch(IOException e){
			System.out.println("some IO error");
		}catch(ArithmeticException e){
			System.out.println("can not devide by zero "+e);
		}catch(Exception e){
		System.out.println("Unknown exception");	
		}
	}

}

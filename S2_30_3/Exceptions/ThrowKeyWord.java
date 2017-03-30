package S2_30_3.Exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThrowKeyWord {

	public static void main(String[] args) {
		int i,j=1,k=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		i=8;
		try{
		System.out.println("Enter a number");
		j=Integer.parseInt(br.readLine());
		k=i+j;
		if(k<10)
		{
			throw new ArithmeticException();
		}
		System.out.println("Output is :"+k);
		}catch(IOException  e)
		{
			System.out.println("enter integers only"+e);
		}catch(ArithmeticException e)
		{
			System.out.println("minimum value for the output is 10"+e);
		}catch(Exception e){
			System.out.println("Unkown Exception");
		}finally{
			System.out.println("Finally bye");
		}
	}
	}



package S2_30_3.Exceptions;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UsingThrowsKeyWord {
	public static void main(String[] args) throws Exception {
		int i,j=1,k=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		i=8;
		System.out.println("Enter a number");
		j=Integer.parseInt(br.readLine());
		k=i+j;
		System.out.println("Output is :"+k);
		}
	}


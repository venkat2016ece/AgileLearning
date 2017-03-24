package S1_24_3.Loops;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a value");
		int a=s.nextInt();
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter b value");
		int b=s1.nextInt();
		if(a>b){
			System.out.println("\n a got a greter value");
		}else{
			System.out.println("\n b got a greter value");
		}
		System.out.println("\n press any key to close application");
	}
		
	}



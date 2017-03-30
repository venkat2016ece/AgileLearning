package S2_30_3.UserDefined.Cheaked.ex2;

import java.util.Scanner;


public class Test {
		static void status(int age) throws InvalidAgeException
		{
			if(age>20){
				System.out.println("eligibile for marriage");
			}else{
			throw new InvalidAgeException("not eligible /by zero");
			}
		}
			

		public static void main(String[] args)throws InvalidAgeException {
	    Scanner s=new Scanner(System.in);
	    int age=s.nextInt();
	    Test.status(age);
		}

	}



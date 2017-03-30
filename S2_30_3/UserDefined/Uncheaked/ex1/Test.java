package S2_30_3.UserDefined.Uncheaked.ex1;

import java.util.Scanner;

public class Test {
	static void status(int age) 
	{
		if(age>20){
			System.out.println("eligibile for marriage");
		}else{
		throw	new InvalidAgeException();
		}
	}
		

	public static void main(String[] args)  {
    Scanner s=new Scanner(System.in);
    int age=s.nextInt();
    Test.status(age);
	}

}

package S1_24_3.Loops;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the any day of the week(1-7)");
		int day=s.nextInt();
		switch(day)
		{
		case 1:
			System.out.println("monday");
			break;
		case 2:
			System.out.println("tuesday");
			break;
		case 3:
			System.out.println("wednesday");
			break;
		case 4:
			System.out.println("thursday");
			break;
		case 5:
			System.out.println("friday");
			break;
		case 6:
			System.out.println("saturday");
			break;
		case 7:
			System.out.println("sunday");
			break;
			default:
				System.out.println("day not found");
		}

	}

}

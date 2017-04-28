package S6_27_4.Collections1;

import java.util.Scanner;

public class FindInLineDemo {
	public static void main(String[] args) {
		String instr="My Age: 28 Id: 77";
		try(Scanner conin=new Scanner(instr)){
			conin.findInLine("Age:");
			if(conin.hasNext())
				System.out.println(conin.next());
			else
				System.out.println("Error");
		}
	}

}

package S6_27_4.Collections1;

import java.util.ArrayDeque;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		ArrayDeque<String> hs=new ArrayDeque<>();
		
		hs.push("Alfa");
		hs.push("Beta");
		hs.push("Eta");
		hs.push("Gamma");
		hs.push("Epsilon");
		hs.push("Omega");
		
		
		while(hs.peek()!=null)
			System.out.println(hs.pop()+"");
	}

}

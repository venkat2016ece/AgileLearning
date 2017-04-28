package S6_27_4.Collections1;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		System.out.println("Intial Size"+al.size());
	al.add("C");
	al.add("A");
	al.add("E");
	al.add("B");
	al.add("D");
	al.add("F");
	al.add(1,"A2");
	System.out.println("size after adding items:"+al.size());
	System.out.println("Content al:"+al);
	
	al.remove("F");
	al.remove(2);
	
	System.out.println("Size after deletions:"+al.size());
	System.out.println("Content:"+al);
	
	System.out.println(al.get(2));
	System.out.println(al.indexOf("A2"));
	
	}

}

package S6_27_4.Collections1;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<>();
		ll.add("F");
		ll.add("F");
		ll.add("F");
		ll.add("F");
		ll.add("F");
		ll.addLast("Z");
		ll.addFirst("A");
		
		System.out.println("Content :"+ll);
		
		ll.remove("F");
		ll.remove("2");
		System.out.println("Content after deletion:");
		
	}

}

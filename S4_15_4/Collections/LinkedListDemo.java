package S4_15_4.Collections;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
			LinkedList l=new LinkedList();
			l.add("venkat");
			l.add(30);
			l.add(null);
			l.add("ravi");
			l.set(0, "software");
			l.add(0,"venky");
			l.removeLast();
			l.addFirst("ccc");
			System.out.println(l);
	}

}

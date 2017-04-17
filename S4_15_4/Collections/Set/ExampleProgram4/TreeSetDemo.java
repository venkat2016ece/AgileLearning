package S4_15_4.Collections.Set.ExampleProgram4;
/*
 * write a program to insert string and stringBuffer objects into treeset where sorting
 * order is increasing length order.if 2 objects having same length then consider
 * their Alphabhatical order */

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet t=new TreeSet(new MyComparable());
		t.add("A");
		t.add(new StringBuffer("ABC"));
		t.add(new StringBuffer("AA"));
		t.add("XX");
		t.add("ABCD");
		t.add("A");
		System.out.println(t);
	}

}

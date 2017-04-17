package S4_15_4.Collections.Set.ExampleProgram3;
/*write a program to insert string buffer object into the tree set where sorting order
 * is Alphabatical order*/

import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet t=new TreeSet(new MyComparator());
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("Z"));
		t.add(new StringBuffer("K"));
		t.add(new StringBuffer("L"));
		System.out.println(t);
	}

}

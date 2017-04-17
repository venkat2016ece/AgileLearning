package S4_15_4.Collections.Set.ExampleProgram2;
/*
 * write a program to insert string object into the treeset where all elements
 * should be inserted according to the reverse of alphabatical order*/

import java.util.TreeSet;

public class TreeSetDemo2 {

	public static void main(String[] args) {
		TreeSet t= new TreeSet(new MyComparator());
		t.add("Venkat");
		t.add("Rajtharun");
		t.add("Srikanth");
		t.add("Laxman");
		t.add("GangaBahavani");
		System.out.println(t);
		
	}

}

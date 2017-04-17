package S4_15_4.Collections.Set.ExampleProgram1;
/*write a program to insert interger object into treeset where the sorting
 * order is desending order*/

import java.util.TreeSet;

public class TreeSetDemo3 {

	public static void main(String[] args) {
		TreeSet t=new TreeSet(new MyComparator());
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(5);
		t.add(20);
		t.add(20);
		System.out.println(t);
		
	}

}

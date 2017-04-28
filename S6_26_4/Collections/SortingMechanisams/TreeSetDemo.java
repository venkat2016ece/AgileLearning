package S6_26_4.Collections.SortingMechanisams;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet t=new TreeSet();
		t.add("venkat");
		t.add("naresh");
		t.add("suresh");
		t.add("raju");
		
		System.out.println(t);
		
		TreeSet tt=new TreeSet();
		tt.add(10);
		tt.add(20);
		tt.add(2);
		tt.add(5);
		System.out.println(tt);
		//internally it is using CompareTo();
	}

}

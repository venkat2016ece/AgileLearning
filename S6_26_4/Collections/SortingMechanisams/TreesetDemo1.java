package S6_26_4.Collections.SortingMechanisams;

import java.util.TreeSet;

public class TreesetDemo1 {

	public static void main(String[] args) {
		TreeSet t1=new TreeSet();
		t1.add(10);
		t1.add(30);
		t1.add(3);
		
		TreeSet t2=new TreeSet(t1);
		//t2.addAll(t1);
		t2.add(2);
		t2.add(6);
		
		System.out.println(t2);
	}

}

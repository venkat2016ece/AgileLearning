package S6_26_4.Collections.SortingMechanisams;

import java.util.TreeSet;

public class TreeSetDemo3 {

	public static void main(String[] args) {
		TreeSet t=new TreeSet();
		t.add("venkat");
		t.add("naresh");
		t.add("suresh");
		t.add(null); //NullPointerException
		
		System.out.println(t);

}
}

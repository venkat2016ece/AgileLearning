package S6_26_4.Collections.SortingMechanisams;

import java.util.TreeSet;

public class TreeSerDemo2 {

	public static void main(String[] args) {
		TreeSet t=new TreeSet();
		t.add("venkat");
		t.add("naresh");
		t.add("suresh");
		t.add(10);//CE:java.lang.ClassCastException
		
		System.out.println(t);
	}}
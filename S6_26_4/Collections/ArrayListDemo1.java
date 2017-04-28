package S6_26_4.Collections;

import java.security.AlgorithmConstraints;
import java.util.ArrayList;

public class ArrayListDemo1 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList<>();
		al.add(10);
		al.add("venkat");
		al.add("sagar");
		al.add(10.5);
		System.out.println(al);
		System.out.println(al.size());
		al.add(1,"anu");
		System.out.println(al);
		System.out.println(al.size());
		
		al.remove(0);//int data index
		System.out.println(al);
		al.remove("venkat");//object based
		System.out.println(al);
		System.out.println(al.contains("sagar"));
		System.out.println(al);
		System.out.println(al.isEmpty());
		System.out.println(al);
		System.out.println(al.containsAll(al));
		System.out.println(al);
		//System.out.println(al.remove(10));
		//System.out.println(al);
		al.remove(0);//1st option
		
		//2nd option
		Integer i=new Integer(10);
		al.add(i);
		al.remove(i);
		
	}
	 
	
	

}

package S6_26_4.Collections;

import java.util.ArrayList;
import java.util.Arrays;

//collection to array
public class ArraysDemo4 {

	public static void main(String[] args) {
		//generic
		ArrayList<String> al=new ArrayList<String>();
		al.add("aaaa");
		al.add("bbbb");
		al.add("cccc");
		al.add("dddd");
		
		String[] s=new String[al.size()];
		al.toArray(s);
		
		for(String str:al){
			System.out.println(str);
		}
		//non generic 
		ArrayList a2=new ArrayList();
		a2.add(10);
		a2.add("venkat");
		a2.add(10.5);
		a2.add(true);
		
		Object oo=a2.toArray();
		for(Object o:a2)
		System.out.println(o);
	}

}

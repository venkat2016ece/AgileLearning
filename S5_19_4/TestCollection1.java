package S5_19_4;

import java.util.ArrayList;
import java.util.Iterator;

public class TestCollection1 {
	public static void main(String[] args) {
		ArrayList<String>list=new ArrayList<String>();//creating array list
		list.add("Ravi");//adding object in arraylist
		list.add("venkat");
		list.add("Ravi");
		list.add("Naresh");
		//Traversing list through Iterator
		Iterator itr=list.iterator();
		while(itr.hasNext());
		System.out.println(itr.next());
		
	}

}

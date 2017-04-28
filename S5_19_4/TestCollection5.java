package S5_19_4;

import java.util.ArrayList;
import java.util.Iterator;

public class TestCollection5 {
//removeAll
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Ravi");//
		al.add("Vijay");//
		
		ArrayList<String> al2=new ArrayList<String>();
		al2.add("Vivaan");//
		al2.add("venkat");//
		al2.add("somu");//
		al2.add("raju");// 
		al.removeAll(al2);
		System.out.println("iterating the elements after removing the elements of al2...,,,,");
		Iterator itr=al.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}

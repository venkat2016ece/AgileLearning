package S5_19_4;

import java.util.ArrayList;
import java.util.Iterator;

public class TestCollection6 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("ravi");
		al.add("Vijay");
		al.add("Ajay");
		ArrayList<String> al2=new ArrayList<String>();
		al2.add("ravi");
		al2.add("Hanumat");
		al.retainAll(al2);
		System.out.println("iterating the elements after retaining the elements of al2...");
		Iterator itr=al.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}

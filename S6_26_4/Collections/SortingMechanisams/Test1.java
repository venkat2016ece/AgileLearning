package S6_26_4.Collections.SortingMechanisams;
//sorting array list data
import java.util.ArrayList;
import java.util.Collections;

public class Test1 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("venkat");
		al.add("naresh");
		al.add("suresh");
		al.add("ramu");
		System.out.println("before sorting="+al);
		Collections.sort(al);
		System.out.println("after sorting="+al);
		
	}

}

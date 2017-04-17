package S5_17_4.CollectionsUtilityMethods.SearchingElementsOfList;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsSearchDemo {

	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		l.add("Z");
		l.add("A");
		l.add("M");
		l.add("K");
		l.add("a");
		System.out.println(l);//[Z,A,M,K,a]
		Collections.sort(l);
		System.out.println(l);
		System.out.println(Collections.binarySearch(l, "Z"));
		System.out.println(Collections.binarySearch(l, "J"));
		
	}

}

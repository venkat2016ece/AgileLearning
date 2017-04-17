package S5_17_4.CollectionsUtilityMethods.ReversingElementsOfList;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionReverseDemo {

	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		l.add(15);
		l.add(0);
		l.add(20);
		l.add(10);
		l.add(5);
		System.out.println(l);
		Collections.reverse(l);}

}

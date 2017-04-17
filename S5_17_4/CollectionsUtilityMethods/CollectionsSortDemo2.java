package S5_17_4.CollectionsUtilityMethods;
/*write a program to sort elements of list according customized sorting*/
import java.util.ArrayList;
import java.util.Collections;

public class CollectionsSortDemo2 {

	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		l.add("Z");
		l.add("A");
		l.add("K");
		l.add("Z");
		System.out.println("before sorting :"+l);
		Collections.sort(l,new MyComparator());
		System.out.println("After sorting :"+l);
	}

}

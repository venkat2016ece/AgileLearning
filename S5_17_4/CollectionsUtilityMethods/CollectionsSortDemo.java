package S5_17_4.CollectionsUtilityMethods;
/*demo program for sorting elements of list according default natural sorting 
 * order.*/
import java.util.ArrayList;
import java.util.Collections;

public class CollectionsSortDemo {

	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		l.add("Z");
		l.add("A");
		l.add("K");
		l.add("N");
		//l.add(new Integer(10));//ClassCastException
		//l.add(null);//NullPointerException
		System.out.println("Before Sorting:"+l);
		Collections.sort(l);
		System.out.println("After sorting:"+l);
		
	}

}

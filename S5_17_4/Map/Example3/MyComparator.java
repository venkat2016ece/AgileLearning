package S5_17_4.Map.Example3;

import java.util.Comparator;

public class MyComparator implements Comparator{

	@Override
	public int compare(Object obj1, Object obj2) {
		String s1=obj1.toString();
		String s2=obj2.toString();
		return s2.compareTo(s1)
				;
	}

}

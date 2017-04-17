package S5_17_4.CollectionsUtilityMethods.ArraySort;

import java.util.Arrays;
import java.util.List;

public class ArrayAsListDemo {

	public static void main(String[] args) {
		String[] s={"A","Z","B"};
		List l=Arrays.asList(s);
		System.out.println(l);
		s[0]="K";
		System.out.println(l);
		l.set(1,"L");
		for(String s1:s)
			System.out.println(s1);
		//l.add("venkat");//UnsupportedOperationException
		//l.remove(2);//UnsupportedOperationException
		//l.set(1,new Integer(10));//ArrayStoreException
		
	}

}

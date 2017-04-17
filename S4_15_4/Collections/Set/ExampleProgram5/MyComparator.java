package S4_15_4.Collections.Set.ExampleProgram5;

import java.util.Comparator;

public class MyComparator implements Comparator{

	@Override
	public int compare(Object ob1, Object ob2) {
		Employee e1=(Employee)ob1;
		Employee e2=(Employee)ob2;
		String s1=e1.name;
		String s2=e2.name;
		return s1.compareTo(s2);
	}
	

}

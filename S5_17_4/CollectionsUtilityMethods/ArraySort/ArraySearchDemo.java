package S5_17_4.CollectionsUtilityMethods.ArraySort;

import java.util.Arrays;

public class ArraySearchDemo {

	public static void main(String[] args) {
		int[] a={10,5,20,11,6};
		Arrays.sort(a);
		System.out.println(Arrays.binarySearch(a, 6));
		System.out.println(Arrays.binarySearch(a, 14));
		String[] s={"A","Z","B"};
		Arrays.sort(s);
		System.out.println(Arrays.binarySearch(s,"Z"));
		System.out.println(Arrays.binarySearch(s,"S"));
		Arrays.sort(s,new MyComparator());
		System.out.println(Arrays.binarySearch(s,"Z",new MyComparator()));
		System.out.println(Arrays.binarySearch(s,"S",new MyComparator()));
		System.out.println(Arrays.binarySearch(s,"N"));
	}
}

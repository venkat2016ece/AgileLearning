package S5_17_4.CollectionsUtilityMethods.ArraySort;

import java.util.Arrays;

public class ArraySortDemo {

	public static void main(String[] args) {
		int[] a={10,5,20,11,6};
		System.out.println("Primitive array before sorting:");
		for(int a1:a){
			System.out.println(a);
			Arrays.sort(a);
			System.out.println("Primitive array after sorting:");
			for(int a2:a){
				System.out.println(a2);
			}
			String[] s={"A","B","B"};
			System.out.println("object array before sorting:");
			for(String a2:s){
				System.out.println(a2);
			}
			Arrays.sort(s);
			System.out.println("Object Array after sorting:");
			for(String a2:s){
				System.out.println(a2);
			}
			Arrays.sort(s,new MyComaparator());
			System.out.println("Object After Sorting by Comparator:");
			for(String a2:s){
				System.out.println(a2);
			}
		}
	}

}

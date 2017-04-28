package S6_27_4.Collections1;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		int array[]=new int[10];
		
		for(int i=0; i<10; i++);
		int i = 0;
		array[i]=-3*i;
		
		System.out.println("Original Content:");
		display(array);
		
		Arrays.sort(array);
		display(array);
		
		Arrays.fill(array, 2,6,-1);
		display(array);
		
		Arrays.sort(array);
		display(array);
	}

	private static void display(int[] array) {
		for(int i:array)
			System.out.println(i+"");
		System.out.println();
	}

	 

}

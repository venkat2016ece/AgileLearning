package S6_27_4.Collections1;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class AlgorithmsDemo {

	public static void main(String[] args) {
		LinkedList<Integer> ll=new LinkedList<>();
		ll.add(-8);
		ll.add(20);
		ll.add(-20);
		ll.add(8);
		
		Comparator<Integer> r=Collections.reverseOrder();
		
		Collections.sort(ll,r);
		System.out.println("sorted from the largest: ");
		for(int i:ll){
			System.out.println(i+" ");
			
			System.out.println();
			Collections.shuffle(ll);
			for(int i1:ll){
				System.out.print(i1+" ");
				
				
				System.out.println("Min:"+Collections.min(ll));
				System.out.println("Max:"+Collections.max(ll));
				
				
			}
		}
	}

}

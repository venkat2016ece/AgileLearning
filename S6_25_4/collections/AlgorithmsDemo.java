package S6_25_4.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class AlgorithmsDemo {

	public static void main(String[] args) {
		LinkedList<Integer>ll=new LinkedList<>();
		ll.add(-8);
		ll.add(20);
        ll.add(-20);
        ll.add(8);

        Comparator<Integer> r = Collections.reverseOrder();

        Collections.sort(ll, r);

        System.out.println("Sorted from the largest: ");
        for(int i : ll)
            System.out.print(i + " ");

        System.out.println();
        Collections.shuffle(ll);
        for(int i : ll)
            System.out.print(i + " ");

        System.out.println("Min: " + Collections.min(ll));
        System.out.println("Max: " + Collections.max(ll));

	}

}

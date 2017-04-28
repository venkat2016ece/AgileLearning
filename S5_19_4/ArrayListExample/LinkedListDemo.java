package S5_19_4.ArrayListExample;

import java.util.*;
/*
 * it is the child class of list interface,Deque,Queue.
 * Linkedlist class extends AbstaractSequentialList
 * Duplicate objects will be allowed.
 * null insertion can be allowed
 * insertion will be preserved.
 * Heterogenious objects can be allowed
 * best suitable for frequent insertion and deletion operations
 * at middle at of the list
 * comapare AL the LL will not be suitable for only frequant retriaval operation because it is not implemented 
 * the random access*/

public class LinkedListDemo {

	public static void main(String[] args) {
		System.out.println("Hello-world");
		ArrayList al=new ArrayList();
		al.add("kiran");
		al.add("suji");
		al.add("vani");
		System.out.println(al);
		LinkedList ll=new LinkedList();
		ll.add("a");
		ll.add(10);
		ll.add(new Integer(100));
		ll.add(null);
		ll.add(2,"ramu");
		System.out.println(ll);
		ll.add(1,al);
		System.out.println(ll);
		ll.add(al)
		System.out.println(ll);
		ll.addFirst("first");
		ll.addLast("Last");
		System.out.println(ll);
		Object o=ll.clone();
		System.out.println("clone values are:"+o);
		System.out.println(ll.contains("ramu"));
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		System.out.println(ll.get(5));
		System.out.println(ll.get(2));
		System.out.println(ll.indexOf("ramu"));
		System.out.println(ll.lastIndexOf("first"));
		System.out.println(ll.remove(5));
		System.out.println(ll.removeFirst());
		System.out.println(ll.removeLast());
		ll.set(0,100);
		System.out.println(ll);
		Object o1[]=ll.toArray();
		System.out.println(o1[1]);
	}
}

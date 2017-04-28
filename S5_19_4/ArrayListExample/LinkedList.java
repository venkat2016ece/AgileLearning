package S5_19_4.ArrayListExample;

import java.util.*;
/*
 * it is the child class of list interface,Deque,Queue.
 * Linkedlist class extends AbstaractSequentialist
 * Duplicate objects wil be alowed.
 * nul insertion can be alowed
 * insertion wil be preserved.
 * Heterogenious objects can be alowed
 * best suitable for frequent insertion and deletion operations
 * at middle at of the list
 * comapare AL the l wil not be suitable for only frequant retriaval operation because it is not implemented 
 * the random access*/

public class LinkedList {

	public static void main(String[] args) {
		System.out.println("Helo-world");
		ArrayList al=new ArrayList();
		al.add("kiran");
		al.add("suji");
		al.add("vani");
		System.out.println(al);
		LinkedList l=new LinkedList();
		l.add("a");
		l.add(10);
		l.add(new Integer(100));
		l.add(nul);
		l.add(2,"ramu");
		System.out.println(l);
		l.add(1,al);
		System.out.println(l);
		l.add(al)
		System.out.println(l);
		l.addFirst("first");
		l.addLast("Last");
		System.out.println(l);
		Object o=l.clone();
		System.out.println("clone values are:"+o);
		System.out.println(l.contains("ramu"));
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		System.out.println(l.get(5));
		System.out.println(l.get(2));
		System.out.println(l.indexOf("ramu"));
		System.out.println(l.lastIndexOf("first"));
		System.out.println(l.remove(5));
		System.out.println(l.removeFirst());
		System.out.println(l.removeLast());
		l.set(0,100);
		System.out.println(l);
		Object o1[]=l.toArray();
		System.out.println(o1[1]);*/
	}

	 
}

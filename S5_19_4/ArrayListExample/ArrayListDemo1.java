package S5_19_4.ArrayListExample;
/*
 * resizable
 * duplicates allowed
 * insertion order is preserved
 * heteroginous objects are allowed(except treeset &treemap)
 * null insertion is possible*/
import java.util.ArrayList;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		System.out.println("Hello-world!");
		ArrayList a=new ArrayList();
		a.add("A");
		a.add(".");
		a.add("ra");
		a.add("m");
		a.add(0,"F");
		a.add("A");
		a.add(null);
		System.out.println(a);
		System.out.println(a.size());
		System.out.println(a.isEmpty());
		System.out.println(a.contains("."));
		System.out.println(a.indexOf("ra"));
		Object o=a.clone();
		System.out.println(o);
		Object o1[]=a.toArray();
		System.out.println(o1[0]);
		System.out.println(o1[2]);
		System.out.println(o1[4]);
		System.out.println(o1[3]);
		//a.clear();
		System.out.println(a);
		System.out.println(a.get(5));
		System.out.println(a.remove(5));
		System.out.println(a);
		a.ensureCapacity(4);
		System.out.println(a.size());
		a.trimToSize();
		System.out.println(a.size());
		/*arraylist is not suitable for frequent insertion and deletion at middle of arraylist,and then to overcome
		 * this problem we have a new class called"Linked list"*/
	}

}

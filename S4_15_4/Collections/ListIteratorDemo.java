package S4_15_4.Collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add("venkat");
		l.add("ravi");
		l.add("naresh");
		l.add("suresh");
		System.out.println(l);
		ListIterator itr=l.listIterator();
		while(itr.hasNext()){
			String s=(String)itr.next();
			if(s.equals("ravi")){
				itr.remove();
			}else if(s.equals("suresh")){
				itr.add("vivaan");
			}else if(s.equals("naresh")){
				itr.set("laxman");
			}
			System.out.println(l);
		}
	}

}

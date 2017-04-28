package S6_27_4.Collections1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");
        al.add("E");
        al.add("F");
        System.out.println("Content:");
        Iterator<String> litr =al.iterator();
        while(litr.hasNext()){
        	System.out.println(litr.next()+"");
        }
        
        ListIterator<String> itr=al.listIterator();
        while(itr.hasNext()){
        	itr.set(itr.next()+"+");
        }
        litr=al.iterator();
        while(itr.hasNext()){
        	System.out.println(litr.next()+"");
        }
        while(itr.hasPrevious()){
        	System.out.println(itr.previous()+"");
        }
	}

}

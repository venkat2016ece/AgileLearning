package S6_26_4.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/*
 *  public java.util.HashMap(int, float);
  public java.util.HashMap(int);
  public java.util.HashMap();
  public java.util.HashMap(java.util.Map<? extends K, ? extends V>);*/

public class Test {
	 public static void main(String[] args) {
		 HashMap h=new HashMap();
		 h.put(111, "venkat");
		 h.put(222, "suresh");
		 h.put(333, "naresh");
		 System.out.println(h);
		 
		Set s= h.keySet();
		System.out.println(s);
		
		Collection c =h.values();
		System.out.println(c);
		
		Set s1=h.entrySet();
		Iterator itr=s1.iterator();
		while(itr.hasNext()){
		Map.Entry m	=(Map.Entry)itr.next();
		System.out.println(m.getKey()+"---------"+m.getValue());
		}
	 
	 }

}

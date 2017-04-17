package S5_17_4.Map;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashDemo {

	public static void main(String[] args) {
		LinkedHashMap m=new LinkedHashMap();
		m.put("Venkat", 700);
		m.put("Naresh", 800);
		m.put("PavanKumar", 200);
		m.put("ShashiKumar", 500);
		System.out.println(m);
		System.out.println(m.put("Venkat", 1000));
		Set s=m.keySet();
		System.out.println(s);
		Collection c=m.values();
		System.out.println(c);
		Set s1=m.entrySet();
		System.out.println(s1);
		Iterator itr=s1.iterator();
		while(itr.hasNext()){
			Map.Entry m1=(Map.Entry)itr.next();
			System.out.println(m1.getKey()+"-------"+m1.getValue());
			if(m1.getKey().equals("ShashiKumar")){
					m1.setValue(10000);
			}
		}
		System.out.println(m);
	}

}

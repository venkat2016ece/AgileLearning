package S6_27_4.Collections1;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HTDemo2 {
	public static void main(String[] args) {
		Hashtable<String,Double> balance=new Hashtable<>();
		Enumeration<String> names;
        String str;
        double bal;

        balance.put("Krishna", 3434.34);
        balance.put("ram", 123.22);
        balance.put("visnu", 1278.00);
        balance.put("vera", 99.22);
        balance.put("sourya", -127.54);
        
        Set<String> set=balance.keySet();
        Iterator<String> itr=set.iterator();
        while(itr.hasNext()){
        	str=itr.next();
        	System.out.println(str+":"+balance.get(str));
        	
        }
        
      System.out.println();
      balance.put("Krishna", balance.get("Krishna")+100);
      System.out.println(balance.get("Krishna"));
        
	}

}

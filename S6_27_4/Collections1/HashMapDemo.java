package S6_27_4.Collections1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String, Double> hm=new HashMap<>();
		hm.put("Krishna", 3434.34);
		hm.put("venkat", 1278.00);
        hm.put("sourya", 99.22);
        hm.put("ramu", -127.54);
        
        Set<Map.Entry<String, Double>> set=hm.entrySet();
        for(Map.Entry<String, Double> me: set)
        	System.out.println(me.getKey()+":"+me.getValue());
        
        hm.put("Krishna", hm.get("Krishna")+1000);
        System.out.println(hm.get("Krishna"));
		
		
	}

}

package S6_26_4.Map;

import java.util.HashMap;

public class Test1 {

	public static void main(String[] args) {
		HashMap h1=new HashMap();
		h1.put(111, "venkat");
		h1.put(222, "laxman");
		
		
		HashMap h2=new HashMap(h1);
		//h2.putAll(h1);
		h2.put(333, "suresh");
		h2.put(444, "bbbb");
		System.out.println(h2);
	}

}

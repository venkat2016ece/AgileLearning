package S5_17_4.Map.Example3;

import java.util.TreeMap;

public class TreeMapDemo2 {

	public static void main(String[] args) {
		TreeMap t=new TreeMap(new MyComparator());
		t.put("ZZZ",10);
		t.put("YYY",20);
		t.put("XXX",30);
		t.put("LLL",40);
		//m.put("FFF", "XXX");//CCE
		//m.put(null, "XXX");//NPE
		System.out.println(t);
	}

}

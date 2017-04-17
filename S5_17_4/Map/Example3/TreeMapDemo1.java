package S5_17_4.Map.Example3;
/*Demo program for Default natural sorting order*/

import java.util.TreeMap;

public class TreeMapDemo1 {

	public static void main(String[] args) {
		TreeMap m=new TreeMap();
		m.put(100, "ZZZ");
		m.put(103, "YYY");
		m.put(101, "XXX");
		m.put(104, 100);
		//m.put("FFF", "XXX");//CCE
		//m.put(null, "XXX");//NPE
		System.out.println(m);
	}

}

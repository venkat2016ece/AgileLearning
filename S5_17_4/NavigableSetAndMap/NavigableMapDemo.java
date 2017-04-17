package S5_17_4.NavigableSetAndMap;

import java.util.TreeMap;

public class NavigableMapDemo {

	public static void main(String[] args) {
		TreeMap<String, String> t=new TreeMap<String, String>();
		t.put("b", "Banana");
		t.put("e", "cat");
		t.put("a", "apple");
		t.put("d", "dog");
		t.put("g", "gun");
		System.out.println(t);
		System.out.println(t.ceilingKey("c"));
		System.out.println(t.higherKey("e"));
		System.out.println(t.floorKey("e"));
		System.out.println(t.lowerKey("e"));
		System.out.println(t.pollFirstEntry());
		System.out.println(t.pollLastEntry());
		System.out.println(t.descendingMap());
		System.out.println(t);
	}

}

package S5_17_4.Map.Example2;

import java.util.WeakHashMap;

public class WeakHashMapDemo2 {

	public static void main(String[] args)throws Exception {
			WeakHashMap m=new WeakHashMap();
			Temp2 t=new Temp2();
			m.put(t, "Venkat");
			System.out.println(m);
			t=null;
			System.gc();
			Thread.sleep(5000);
			System.out.println(m);
	}

}

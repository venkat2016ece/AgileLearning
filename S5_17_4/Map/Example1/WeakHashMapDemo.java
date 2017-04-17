package S5_17_4.Map.Example1;
/*
 * in this Example temp object not eligible for GC because it is associated with 
 * hashmap in this case output is {temp=Venkat}  {temp=Venkat}*/
import java.util.HashMap;

public class WeakHashMapDemo {

	public static void main(String[] args)throws Exception {
			HashMap m=new HashMap();
			Temp t=new Temp();
			m.put(t, "Venkat");
			System.out.println(m);
			t=null;
			System.gc();
			Thread.sleep(5000);
			System.out.println(m);
	}

}

package S6_26_4.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test2 {

	public static void main(String[] args) {
			HashMap<Emp,Student> h1=new HashMap<Emp,Student>();
			h1.put(new Emp(111,"venkat"),new Student(1,"a"));
			h1.put(new Emp(222,"naresh"),new Student(1,"b"));
			h1.put(new Emp(333,"suresh"),new Student(1,"c"));
			
			Set s=h1.entrySet();
			Iterator itr=s.iterator();
			while(itr.hasNext())
			{
				Map.Entry m=(Map.Entry)itr.next();
				Emp e=(Emp)m.getKey();
				System.out.println(e.eid+"--------"+e.ename);
				
				Student ss=(Student)m.getValue();
				System.out.println(ss.sid+"-------"+ss.sname);
				
			}
	}

}

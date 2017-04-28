package S6_26_4.Collections.SortingMechanisams;

import java.util.ArrayList;
import java.util.Collections;

//soting of emp data by using comparable

public class Test2 {

	public static void main(String[] args) {
		ArrayList<Emp> al=new ArrayList<Emp>();
		al.add(new Emp(333,"venkat"));
		al.add(new Emp(444,"laxman"));
		al.add(new Emp(555,"vivaan"));
		Collections.sort(al);
		
		for(Emp e:al)
		System.out.println(e.eid+"---------"+e.name);
		
		//problem no1  here we are sorting by using id or name.
		//problem no2 here we are mixing 
	}

}

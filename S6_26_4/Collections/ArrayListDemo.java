package S6_26_4.Collections;

import java.util.ArrayList;

public class ArrayListDemo {
	
public static void main(String[] args) {
	Emp e1=new Emp(111,"venkat");
	Emp e2=new Emp(222,"vivaan");
	Emp e3=new Emp(333,"sagar");
	
	ArrayList<Emp> al=new ArrayList<Emp>();
	al.add(e1);
	al.add(e2);
	al.add(e3);
	
	for(Emp e:al)
	{
		System.out.println(e.eid+"------"+e.name);
	}
	
}

}

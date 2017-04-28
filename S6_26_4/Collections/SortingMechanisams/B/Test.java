package S6_26_4.Collections.SortingMechanisams.B;

import java.util.TreeSet;

public class Test {
	public static void main(String[] args) {
Emp e1=new Emp(111,"venkat....");
Emp e2=new Emp(222,"suresh");
Emp e3=new Emp(333,"naresh");


TreeSet<Emp> t=new TreeSet<Emp>(new EnameComp());
t.add(e1);
t.add(e2);
t.add(e3);

for(Emp e:t){
	System.out.println(e.id+"-------"+e.name);
}

	}
}

package S6_26_4.Collections;

import java.util.ArrayList;

import javax.swing.plaf.synth.SynthOptionPaneUI;

//how to add one collection data into another
public class CollectionDemo2 {

	public static void main(String[] args) {
		Emp e1=new Emp(111,"venkat");
		Emp e2=new Emp(222,"vivaan");
		Emp e3=new Emp(333,"sagar");
		Emp e4=new Emp(333,"laxman");
		ArrayList<Emp> a1=new ArrayList<Emp>();
				a1.add(e1);
		        a1.add(e2);
		 ArrayList<Emp> a2=new ArrayList<Emp>();
		 a2.addAll(a1);
		 a2.add(e3);
		 a2.add(e4);
		 System.out.println(a2.contains(e1));
		 System.out.println(a2.containsAll(a1));
		 
		 a2.remove(e1);
		 System.out.println(a2.contains(e1));
		 System.out.println(a2.containsAll(a1));
		 System.out.println();
		 
		 
		/* for (Emp e :a2);
		 System.out.println(e.eid+"------"+e.name);*/
	}
		        
		        

	}



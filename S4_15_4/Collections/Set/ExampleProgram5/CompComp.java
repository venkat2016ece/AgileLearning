package S4_15_4.Collections.Set.ExampleProgram5;

import java.util.TreeSet;

public class CompComp {

	public static void main(String[] args) {
			Employee e1=new Employee("venky",100);
			Employee e2=new Employee("Rajesh",20);
			Employee e3=new Employee("Shanker",200);
			Employee e4=new Employee("Ramu",50);
			Employee e5=new Employee("shireesh",150); 
			TreeSet t=new TreeSet();
			t.add(e1);
			t.add(e2);
			t.add(e3);
			t.add(e4);
			t.add(e5);
			System.out.println(t);
			TreeSet t1=new TreeSet();
			t1.add(e1);
			t1.add(e2);
			t1.add(e3);
			t1.add(e4);
			t1.add(e5);
			System.out.println(t1);
	}

}

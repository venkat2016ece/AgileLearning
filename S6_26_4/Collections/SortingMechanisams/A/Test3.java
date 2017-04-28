package S6_26_4.Collections.SortingMechanisams.A;
//sorting arraylist data by using comparator
import java.util.ArrayList;
import java.util.Collections;

public class Test3 {

	public static void main(String[] args) {
		ArrayList< Empp> al=new ArrayList<Empp>();
		al.add(new Empp(333,"venkat"));
		al.add(new Empp(222,"hareesh"));
		al.add(new Empp(111,"suresh"));
		al.add(new Empp(444,"xxx"));
		
		Collections.sort(al,new EnameComp());
		
		for(Empp e:al){
			System.out.println(e.eid+"------"+e.ename);
		}
	}

}

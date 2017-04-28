package S6_26_4.Collections.SortingMechanisams.A;

import java.util.Comparator;

public class EnameComp implements Comparator<Empp> {

	
	public int compare(Empp e1, Empp e2) {
		return (e1.ename).compareTo(e2.ename);
	}

	 
}

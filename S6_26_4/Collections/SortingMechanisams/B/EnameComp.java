package S6_26_4.Collections.SortingMechanisams.B;

import java.util.Comparator;

public class EnameComp implements Comparator<Emp> {

	@Override
	public int compare(Emp e1, Emp e2) {
		return (e1.name).compareTo(e2.name);
	}

}


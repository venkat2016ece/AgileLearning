package S6_26_4.Collections.SortingMechanisams.A;

import java.util.Comparator;

public class EidComp implements Comparator<Empp> {
	public int compare(Empp e1, Empp e2) {
		 
		if(e1.eid==e2.eid){
			return 0;
		}else if(e1.eid>e2.eid){
			return 1;
		}else{
		return 1;
	    }
		}

}

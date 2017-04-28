package S6_26_4.Collections.SortingMechanisams.B;

import java.util.Comparator;

public class EidComp implements Comparator<Emp> {
	public int compare(Emp e1, Emp e2) {
		 
		if(e1.id==e2.id){
			return 0;
		}else if(e1.id>e2.id){
			return 1;
		}else{
		return 1;
	    }
		}

}

package S6_26_4.Collections.SortingMechanisams;

public class Emp implements Comparable<Emp> {

	public int eid;
	public String name;

	public Emp(int eid, String name) {
		this.eid=eid;
		this.name=name;
	}

	@Override
	public int compareTo(Emp e) {
	/*	if(eid==e.eid){
			return 1;
		}
		else if(eid>e.eid){
		return 1;
		}else{
		return -1;*/
		return name.compareTo(e.name);
		
	}
	}



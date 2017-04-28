package S6_26_4.Collections;
public class Emp implements Comparable {

	public int eid;
	public String name;

	public Emp(int eid, String name) {
		this.eid=eid;
		this.name=name;
	}

	@Override
	public int compareTo(Object o) {
		Emp e=(Emp)o;
		if(eid==e.eid){
			return 1;
		}
		else if(eid>e.eid){
		return 1;
		}else{
		return -1;
	}
	}

}

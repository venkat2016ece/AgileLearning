package S4_15_4.Collections.Set.ExampleProgram5;


public class Employee implements Comparable{
	String name;
	int eid;
	Employee(String name,int eid){
		this.name=name;
		this.eid=eid;
	}
	public String toString(){
		return name+"----"+eid;
	}
	@Override
	public int compareTo(Object obj) {
		int eid1=this.eid;
		Employee e=(Employee)obj;
		int eid2=e.eid;
		if(eid1<eid2){
		return -1;
	}
		else if(eid1>eid2){
			return 1;
			}
		return 0;
		}
  }

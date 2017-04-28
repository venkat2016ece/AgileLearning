package S5_19_4;

import java.util.ArrayList;

public class TestCollection2 {
	public static void main(String args[]){
		ArrayList<String> al=new ArrayList<String>();
		al.add("Ravi");
		al.add("Venkat");
		al.add("Ravi");
		al.add("Ajay");
		for(String obj:al)
			System.out.println(obj);
	}

}

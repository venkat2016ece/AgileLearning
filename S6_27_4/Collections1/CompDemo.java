package S6_27_4.Collections1;

import java.util.Comparator;
import java.util.TreeSet;
class MyComp implements Comparator<String>{

	@Override
	public int compare(String aStr, String bStr) {
		return bStr.compareTo(aStr);
	}
	
}

public class CompDemo {

	public static void main(String[] args) {
		TreeSet<String>hs=new TreeSet<>((aStr,bStr)->
		bStr.compareTo(aStr));
		hs.add("Alfa");
		hs.add("Beta");
		hs.add("Eta");
		hs.add("Gamma");
		hs.add("Epsilon");
		hs.add("Omega");
		
		System.out.println("Content:"+hs);
	}

}

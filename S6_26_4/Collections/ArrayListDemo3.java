package S6_26_4.Collections;
//conversion arrays to collection object
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		String[] s={"venkat","naresh","Suresh"};
		
		ArrayList<String> al=new ArrayList<String>(Arrays.asList(s));
		al.add("suresh");
		al.add("hareesh");
		
		for(String str:al){
			System.out.println(str);
		}
	}

}

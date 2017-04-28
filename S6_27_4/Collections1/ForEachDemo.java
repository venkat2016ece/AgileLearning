package S6_27_4.Collections1;

import java.util.ArrayList;

public class ForEachDemo {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		
		System.out.println("Content al: ");
		for(int v:al)
			System.out.println(v+"");
		int sum=0;
		for(int v:al)
			sum+=v;
		
		System.out.println("Suma:"+sum);
	}

}

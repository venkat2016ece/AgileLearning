package S2_31_3.Anotations.GeneralPurposeAnotations.SuppressWarnings;

import java.util.ArrayList;

public class Bank {
	@SuppressWarnings("unchecked")
	public ArrayList get_Customers_Details()
	{
		ArrayList al=new ArrayList();
		al.add("AAA");
		al.add("BBB");
		al.add("CCC");
		al.add("DDD");
		al.add("EEE");
		return al;
	}
}

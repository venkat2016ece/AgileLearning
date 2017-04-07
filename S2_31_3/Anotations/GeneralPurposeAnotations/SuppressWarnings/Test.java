package S2_31_3.Anotations.GeneralPurposeAnotations.SuppressWarnings;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		Bank b=new Bank();
		ArrayList list=b.get_Customers_Details();
		System.out.println(list);
	}

}

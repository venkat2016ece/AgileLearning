package S6_27_4.Collections1;

import java.util.Enumeration;
import java.util.Hashtable;

public class HTDemo {
	public static void main(String[] args) {
	Hashtable<String, Double> balance=new Hashtable<>();
	Enumeration<String> names;
	String str;
	double bal;
	 balance.put("Jan Kowalski", 3434.34);
	balance.put("Piotr Nowak", 123.22);
    balance.put("Joanna Bąk", 1278.00);
    balance.put("Rafał Brzęczyszczykiewicz", 99.22);
    balance.put("Tomek Nosek", -127.54);
    
    names=balance.keys();
    while(names.hasMoreElements()){
    	str=names.nextElement();
    	System.out.println(str+ ":"+balance.get(str));
    }
    System.out.println();
    balance.put("Jan Kowalski", balance.get("Jan Kowalski")+1000);
    
    System.out.println(balance.get("Jan Kowalski"));

}
}

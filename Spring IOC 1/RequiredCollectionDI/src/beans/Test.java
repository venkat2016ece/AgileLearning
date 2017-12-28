package beans;

import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;


public class Test {
	private Vector fruits;
	private TreeSet criketers;
	private Hashtable cc;
	 
	 
public void setFruits(Vector fruits) {
		this.fruits = fruits;
	}
	public void setCriketers(TreeSet criketers) {
		this.criketers = criketers;
	}
	public void setCc(Hashtable cc) {
		this.cc = cc;
	}
public void printData(){
	System.out.println("Fruits....");
	for(Object fruite:fruits){
		System.out.println(fruite );
	}
	System.out.println("cricketers.........");
	for(Object cricketers:criketers){
		System.out.println(cricketers);
	}
	System.out.println("countrys and capitals....");
		Set keys=cc.keySet();
		for(Object key:keys){
			System.out.println("Country:"+key+":capital"+cc.get(key));
			
		}
}
}

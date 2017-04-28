package S6_25_4.Strings;

public class SubStringCons {
	public static void main(String[] args) {
		
	byte ascii[]={65,66,67,68,69,70,71,72};
	
	String s1=new String(ascii);
	String s2=new String(ascii,2,4);
	
	System.out.println(s1);
	System.out.println(s2);

}
}
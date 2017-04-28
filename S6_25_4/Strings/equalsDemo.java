package S6_25_4.Strings;

public class equalsDemo {
	public static void main(String[] args) {
		String s1="Witaj";
		String s2="Witaj";
		String s3="Hello";
		String s4="WITAJ";
		 
		/*System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equalsIgnoreCase(s4));
		
		
		System.out.println(s1.regionMatches(true, 1, s4,1,3));
		System.out.println(s1.startsWith("ta",2));
		System.out.println(s1.endsWith("aj"));*/
		
		String s5=s1;
		System.out.println("equal:"+s1.equals(s5));
		System.out.println("==:"+s1==s5);
	}

}

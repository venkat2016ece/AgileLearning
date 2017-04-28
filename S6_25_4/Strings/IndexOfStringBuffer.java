package S6_25_4.Strings;

public class IndexOfStringBuffer {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("One two one");
		int i;//why int
		
		i=sb.indexOf("one");
		System.out.println(i);
		
		i=sb.lastIndexOf("one");
		System.out.println(i);
	}

}

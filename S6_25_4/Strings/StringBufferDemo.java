package S6_25_4.Strings;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Witaj sese");
		sb.ensureCapacity(100);
		
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
	}

}

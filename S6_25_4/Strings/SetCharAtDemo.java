package S6_25_4.Strings;

public class SetCharAtDemo {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Witaj");
		sb.ensureCapacity(100);
		
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
		sb.setCharAt(1, 'y');
		sb.setLength(3);
		System.out.println(sb);
		
		sb=sb.append("taj").append("!");
		System.out.println(sb);
		
		StringBuffer s=new StringBuffer("More Java");
		s.insert(7,"likes");
		System.out.println(s);
		
		s.reverse();
		System.out.println(s);
	}

}

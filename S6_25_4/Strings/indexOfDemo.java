package S6_25_4.Strings;

public class indexOfDemo {
	public static void main(String[] args) {
		String s="Is it nice to mean the same thing as to be good?"+"Is being good is equivalent to being nice?";
		
		System.out.println(s);
		System.out.println(s.indexOf('b'));
		System.out.println(s.lastIndexOf('b'));
		System.out.println(s.indexOf("good"));
		System.out.println(s.lastIndexOf("good"));
		System.out.println(s.lastIndexOf("same",50));//wht is 50  in this
		System.out.println(s.indexOf("b",10));
	}
}

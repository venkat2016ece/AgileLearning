package S6_24_4.Exceptions;

public class MultiCatch {

	public static void main(String[] args) {
		try{
			int a=args.length;
			System.out.println("a="+a);
			int b=42/a;
			int c[]={1};
			c[42]=99;
		}catch(ArithmeticException e){
			System.out.println("Division by zero: " +e);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("index outside borders:"+e);
		}
		System.out.println("In try-cacth");
	}

}

package S6_24_4.Exceptions;

public class Exec0 {
	public static void main(String[] args) {
		try{
			int d=0;
			int a=42/d;
			System.out.println("Error");
		}catch(ArithmeticException e){
			System.out.println("Division by zero"+e);
		}
		System.out.println("By catch");
	}

}

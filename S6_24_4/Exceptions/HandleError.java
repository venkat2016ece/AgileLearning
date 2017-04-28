package S6_24_4.Exceptions;

import java.util.Random;

public class HandleError {
	public static void main(String[] args) {
		int a,b,c,i;
		Random r=new Random();
		for(i=0;i<32000;i++){
			try{
				b=r.nextInt();
				c=r.nextInt();
				a=12345/(b/c);
			}catch(ArithmeticException e){
				System.out.println("Division by zero");
				a=0;
			}
			System.out.println("a:"+a);
		}
		System.out.println("i:"+i);
	}

}

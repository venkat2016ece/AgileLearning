package S2_1_4.Exceptions;

public class Division {

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException{
		try{
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
		System.out.println("a value: "+a);
		System.out.println("b value: "+b);
		int c=a/b;
		
		System.out.println(c);
	}
	catch(ArrayIndexOutOfBoundsException e){
		System.out.println("please dont pass second value as a 0");
		
	}

}}

package S2_1_4.Exceptions;

public class Example1 {

	public static void main(String[] args) {
		try{int a=Integer.parseInt(args[0]);
		System.out.println("a"+a);
		try{
			int[] x=new int[a];
			System.out.println("array size"+x.length);
			}catch(NullPointerException npe){
				System.out.println("npe is raised");
			}
		int b=a+20;
		System.out.println("b value:"+b);
		}catch(ArrayIndexOutOfBoundsException aioe){
			System.out.println("passone int value");
		}catch(NumberFormatException npe){
			System.out.println("pass only int value");
		}
		System.out.println("after outer try/catch");
	}

}

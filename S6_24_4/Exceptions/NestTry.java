package S6_24_4.Exceptions;

public class NestTry {
	static void nesttry(int a){
		
		try{
			if(a==1)a=a/(a-a);
			if(a==2){
				int c[]={1};
				c[42]=99;
			}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Outside of the array " +e);
			
		}
	}
	public static void main(String[] args) {
		try{
			int a=2;
			//int b=42/a;
			nesttry(2);
			nesttry(2);
			nesttry(0);
		}catch(ArithmeticException e){
			System.out.println("Divide with zero:"+e);
		}
	}

}

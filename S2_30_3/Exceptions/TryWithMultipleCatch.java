package S2_30_3.Exceptions;

public class TryWithMultipleCatch {

	public static void main(String[] args) {
		int i,j,k = 0;
		int a[]=new int[4];
		i=2;
		j=2;
		try
		{
		k=i/j;
		for(int c=0;c<=4;c++){
			a[c]=c+1;
		}
		for(int value:a){
			
			System.out.println(value);
		}
		}catch(ArithmeticException e){
			System.out.println("can not devide by zero\n"  +e);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Maximum number of value is 4");
		}
		System.out.println("VALUE OF K="+k);
	}
}

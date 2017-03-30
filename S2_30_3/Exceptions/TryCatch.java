package S2_30_3.Exceptions;

public class TryCatch {

	public static void main(String[] args) {
		int i,j,k = 0;
		i=8;
		j=0;
		try
		{
		k=i/j;	
		}catch(Exception e){
			System.out.println("can not devide by zero\n"  +e);
		}
		System.out.println(k);
	}
}

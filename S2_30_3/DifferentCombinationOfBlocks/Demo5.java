package S2_30_3.DifferentCombinationOfBlocks;

public class Demo5 {

	public static void main(String[] args) {
		try{
			System.out.println(10/0);
		}catch(ArithmeticException ac){
			System.out.println("catch");
		}finally{
			System.out.println(10/0);
		}
			}
	}


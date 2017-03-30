package S2_30_3.DifferentCombinationOfBlocks;

public class Demo3 {
public static void main(String[] args) {
	try{
		System.out.println(10/0);
	}catch(NullPointerException ac){
		System.out.println("catch");
	}finally{
		System.out.println("finally\n");
	}
		}
}


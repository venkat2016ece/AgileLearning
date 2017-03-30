/**
 * 
 */
package S2_30_3.DifferentCombinationOfBlocks;

/**
 * @author welcome
 *
 */
public class Demo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try{
			System.out.println(10/0);
		}catch(ArithmeticException ac){
			System.out.println("catch");
		}finally{
			System.out.println("finally");
		}
			}
	}


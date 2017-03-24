/**
 * 
 */
package S1_24_3.Methods.PassByValue;

/**
 * @author welcome
 *
 */
public class PassByReference {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] value={125,625};
		System.out.println("before displayArray method first element of value array="+value[0]);
		displayArray(value);
		System.out.println("after displayArray method first element of value array="+value[0]);
			
		}
	public static void displayArray(int[] values){
		System.out.println("Inside dipaly method num "+values[0]);
	}

}

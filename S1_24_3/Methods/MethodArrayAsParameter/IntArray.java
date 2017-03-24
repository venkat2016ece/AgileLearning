/**
 * 
 */
package S1_24_3.Methods.MethodArrayAsParameter;

/**
 * @author welcome
 *
 */
public class IntArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] marks={22,66,33,99,88,77};
		display(marks);
		
		//int[] revmarks;
		//revmarks=reverseArray(marks);
		System.out.println("reverse array elements");
		//display(revmarks);
		display(reverseArray(marks));
	}
	public static void display(int[] input){
		for(int counter=0;counter<input.length;counter++){
			System.out.println(input[counter]);
		}
	}
	public static int[] reverseArray(int[] input){
		int[] reverse=new int[input.length];
		for(int i=0,j=reverse.length-1;i<input.length;i++,j--){
			reverse[j]=input[i];
		}
		return reverse;

	}
	 
}

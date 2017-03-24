/**
 * 
 */
package S1_24_3.Methods.StaticMethod;

/**
 * @author welcome
 *
 */
public class StaticMethod {

	/**1.static is a key word used in java
	 * 2.static it belongs to class that means you no need instantiate object.
	 * we can directly use the class names 
	 */
	public static void main(String[] args) {
		 Abc.show();
		// Abc.i=5;
	}

}
class Abc{
	static int i=0;
	public static void show(){
		System.out.println("hai........");
		System.out.println(i);
		 
	}
}

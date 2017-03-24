/**
 * 
 */
package S1_24_3.Methods.MethodWithNoReturnValue;

/**
 * @author welcome
 *
 *	We are writing code for methods not returning any values.
 */
public class MethodsWithNoReturnValue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		myMethod();

	}
	
	// Here void keyword  makes sure that this myMethod() will not return value
	public static void myMethod(){
		System.out.println("Methods with No Return Type Example");
		int a,b;
		  a=10;
		  b=(a==1)?20:30; // this is an example of ternary operator.
		  System.out.println("value of b is:" +b);
	}

}

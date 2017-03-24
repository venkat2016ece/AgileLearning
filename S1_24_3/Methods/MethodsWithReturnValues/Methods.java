/**
 * 
 */
package S1_24_3.Methods.MethodsWithReturnValues;

/**
 * @author welcome
 *
 */
public class Methods {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		sayHelloWorld();
		
		sayHelloWorld("Charlee");
		sayHelloWorld("John");
		
		int x=returnFive();
		System.out.println(x);
		
		int result=Square(5);
		System.out.println(result);
		
		float x1=returnFloat();
		System.out.println(x1);
		
		long x2=returnLong();
		System.out.println(x2);
		
		double x3=returnDouble();
		System.out.println(x3);
		
		boolean x4=returnBoolean();
		System.out.println(x4);
		
		char x5=returnChar();
		System.out.println(x5);
		}
		
		
	//this method write a char value with value 'a';
	static char returnChar(){
		return 'a';
	}
	//this method write a boolean value with value true
	static boolean returnBoolean(){
		return true;
	}
	//this method write a double value  with value 40.0
	static double returnDouble(){
		return 40.0;
	}
	//this method write a Long value  with value 10L
	static long returnLong(){
		return 10L;
	}
	
	//this method both return value and take in data
	static int Square(int x){
		return x*x;
	}
	//this method returns a float value with a value 5.5f
	static float returnFloat(){
		return 5.5f;
	}
	
	//this method returns a int value with a value five
	static int returnFive(){
		return 5;
		
	}
	//this method will say hello whatever name is passed when called
	static void sayHelloWorld(String name){
		System.out.println("Hello"+name);
	}
	// this method simply say hello world
	  static void sayHelloWorld(){
		System.out.println("hello,word");
	}

}

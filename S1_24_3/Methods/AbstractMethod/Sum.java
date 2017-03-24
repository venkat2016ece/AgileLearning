/**
 * 
 */
package S1_24_3.Methods.AbstractMethod;

/**
 * @author welcome
 * 1) Abstract class can also have regular(or concrete) methods along with abstract methods.
2) Abstract methods do not have body, they just have prototype(method signature).
3) Abstract methods must be implemented in the child class (if the class is not abstract) otherwise program will throw compilation error.
 */
//abstract class
abstract class Sum {
	//abstract methods
	public abstract int SumofTwo(int n1,int n2);
	public abstract int SumofThree(int n1,int n2,int n3);
	
	//regular method
	public void dis(){
		System.out.println("method of class sum");
	}
static class AbstractDemo extends Sum{
	public int SumofTwo(int num1,int num2){
		return num1+num2;
	}
	public int SumofThree(int num1,int num2,int num3){
		return num1+num2+num3;
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AbstractDemo obj=new AbstractDemo();
		System.out.println(obj.SumofTwo(3, 7));
		System.out.println(obj.SumofThree(4, 3, 19));
		obj.dis();

	}
}
}




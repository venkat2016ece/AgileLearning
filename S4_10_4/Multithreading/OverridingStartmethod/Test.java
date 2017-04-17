package S4_10_4.Multithreading.OverridingStartmethod;

public class Test {
	public static void main(String[] args) {
		MyThread t=new MyThread();
		t.start();
		System.out.println("main method");
	}

}
/*if we override start() then our start() method will be executed
 *  just like a normal method call and NewThread wont't be created
 * output:start method
			main method
*/
 

//it is not recomonded to override start method otherwise dont't go for multithreading






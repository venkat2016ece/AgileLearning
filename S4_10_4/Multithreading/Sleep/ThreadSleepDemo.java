package S4_10_4.Multithreading.Sleep;

public class ThreadSleepDemo {

	public static void main(String[] args) {
		Mythread t=new Mythread();
		t.start();
		t.interrupt();
		System.out.println("End of main method");
		
	}

}

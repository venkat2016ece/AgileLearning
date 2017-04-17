package S4_10_4.Multithreading.Sleep.SecondDemo;

public class ThreadSleepDemo {

	public static void main(String[] args) {
		MyThread t=new MyThread();
		t.start();
		t.interrupt();
		System.out.println("end of main");
	}

}
//in the above example Interrupt call waited until thread complets for loop 10thousend times
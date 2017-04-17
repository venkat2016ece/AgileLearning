package S4_10_4.Multithreading.Priorities;

public class Test {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getPriority());
		//Thread.currentThread().setPriority(15);//RE:
		Thread.currentThread().setPriority(7);
		MyThread t=new MyThread();
		System.out.println(t.getPriority());
	}

}

package S4_10_4.Multithreading.Priorities;

public class ThreadPriorityDemo {

	public static void main(String[] args) {
		MyThread1 t=new MyThread1();
		t.setPriority(10);
		t.start();
		for(int i=0;i<10;i++){
			System.out.println("main thread");
		}
	}

}

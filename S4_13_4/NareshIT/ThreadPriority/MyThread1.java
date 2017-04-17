package S4_13_4.NareshIT.ThreadPriority;

public class MyThread1 extends Thread {
	MyThread1(String s){
		super(s);
		start();
	}
	public void run(){
		for(int i=0;i<3;i++){
			Thread cur=Thread.currentThread();
			cur.setPriority(Thread.MIN_PRIORITY);
			int p=cur.getPriority();
			System.out.println("Thread name:"+Thread.currentThread().getName());
			System.out.println("Thread Priority"+cur);
		}
	}
}

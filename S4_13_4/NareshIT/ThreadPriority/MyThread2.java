package S4_13_4.NareshIT.ThreadPriority;

public class MyThread2 extends Thread {
	MyThread2(String s){
		super(s);
		start();
	}
	public void run(){
		for(int i=0;i<3;i++){
			Thread cur=Thread.currentThread();
			cur.setPriority(Thread.MAX_PRIORITY);
			int p=cur.getPriority();
			System.out.println("Thread name:"+Thread.currentThread().getName());
			System.out.println("Thread Priority"+cur);
		}
	}

}

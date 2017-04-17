package S4_10_4.Multithreading.join;
//waiting of main  thread until completing of childthread

public class ThreadjoinDemo {

	public static void main(String[] args)throws InterruptedException {
		MyThread t=new MyThread();
		t.start();
		t.join();
		for(int i=0;i<10;i++){
			System.out.println("ravi thread");
		}
		
	}

}

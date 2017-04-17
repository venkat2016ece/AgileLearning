package S4_13_4.NareshIT.OverloadingRunMethod.Start;
/**
 * after calling a start method we are not allowed to restart the same thread once again
 * we get the run time Exception java.lang.IllegalThreadStateException
  */

public class MyThread1 extends Thread{
		public void run(){
			for(int i=0;i<10;i++){
				System.out.println("run method");
			}
		}
	public static void main(String[] args) {
		MyThread1 t=new MyThread1();
		t.start();
		t.start();
		for(int i=0;i<10;i++){
			System.out.println("main thread");
		}

	}

}

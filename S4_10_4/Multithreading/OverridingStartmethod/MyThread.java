package S4_10_4.Multithreading.OverridingStartmethod;

	public class MyThread extends Thread{
		public void start(){
			System.out.println("start method");
		}
		public void run(){
			System.out.println("run-method");
		}

	}



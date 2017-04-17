package S4_10_4.Multithreading.ImplementsRunnable;

public class MyRunnable implements Runnable {
	public void run()
	{
		for(int i=0;i<10;i++){
			System.out.println("child thread");
		}
	}
}

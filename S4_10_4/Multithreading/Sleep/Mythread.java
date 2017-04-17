package S4_10_4.Multithreading.Sleep;

public class Mythread extends Thread {
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("Iam Lazy method");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println("I got interrupted");
			}
		}
	}
}

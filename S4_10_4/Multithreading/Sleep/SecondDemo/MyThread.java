package S4_10_4.Multithreading.Sleep.SecondDemo;

public class MyThread extends Thread {
	public void run(){
		for(int i=0;i<=10000;i++){
			System.out.println("i am lazy method"+i);
		}
		System.out.println(" iam entering in to the sleep method");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			System.out.println(" i got interrupted");
		}
	}
}

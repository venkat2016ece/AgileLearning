package S4_10_4.Multithreading.ByExtendingThreadClass;

public class MyThread extends Thread {
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("child thread");
		}
	}

}

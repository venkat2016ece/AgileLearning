package S4_13_4.NareshIT.DefiningThread;

public class MyRunnable implements Runnable {
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println("child method");
		}
	}
	public static void main(String[] args) {
		MyRunnable my= new MyRunnable();
		Thread t=new Thread(my);
		t.start();
		for(int i=0;i<10;i++){
			System.out.println("main method");
		}
	}
	}


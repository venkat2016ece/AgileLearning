package S4_13_4.NareshIT.DefiningThread;

public class MyThread extends Thread{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("child Thread");
		}
	}
	public static void main(String[] args) {
			MyThread t=new MyThread();
			//t.start();
			t.run();
			System.out.println("**********************************");
			for(int i=1;i<10;i++){
				System.out.println("main thread");
			}
	}

}

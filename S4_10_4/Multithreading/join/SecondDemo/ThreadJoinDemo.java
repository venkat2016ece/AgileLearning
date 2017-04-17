package S4_10_4.Multithreading.join.SecondDemo;
//waiting of child thread until completing main Thread

public class ThreadJoinDemo {

	public static void main(String[] args)throws InterruptedException {
		MyThread mt= Thread.currentThread();
		MyThread t=new MyThread();
		t.start();
		for(int i=0;i<10;i++){
			System.out.println("main method");
			Thread.sleep(2000);
		}
		
		
		
	}

}

package S4_13_4.NareshIT.ThreadPool;

import java.util.Queue;

class Consumer implements Runnable{
	
	public void run(){
		try{
			System.out.println("Removing Element"+Queue.class);
			Thread.sleep(1000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}

}

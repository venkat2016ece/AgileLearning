package S4_13_4.NareshIT.ThreadPool.A;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ThreadPool {
	private final BlockingQueue<Runnable>workerQueue;
	private final Thread[] workerThreads;
	public ThreadPool(int numThreads){
		workerQueue=new LinkedBlockingQueue<Runnable>();
		workerThreads=new Thread[numThreads];
		int i=0;
		for(Thread t:workerThreads){
			i++;
			t=new Worker("Pool Thread"+1);
			t.start();
		}
	}
	public void addTask(Runnable r){
		try{
			workerQueue.put(r);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}

}

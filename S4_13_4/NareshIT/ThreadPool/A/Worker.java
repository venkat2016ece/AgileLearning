package S4_13_4.NareshIT.ThreadPool.A;

public class Worker extends Thread{
	public Worker(String name){
			super(name);
	}
	public void run(){
		while(true){
			try{
				Runnable r=workerQueue.take();
				r.run();
			}catch(InterruptedException e){
				e.printStackTrace();
			}catch(RuntimeException e){
				e.printStackTrace();
			}
		}
	}

}

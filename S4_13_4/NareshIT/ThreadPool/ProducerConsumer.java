package S4_13_4.NareshIT.ThreadPool;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import S4_13_4.NareshIT.InterThread.Consumer;
import S4_13_4.NareshIT.InterThread.Producer;

public class ProducerConsumer   {
	private final BlockingQueue<Integer>queue;
	private static final Random rnd=new Random();
	public static void main(String[] args) {
		ProducerConsumer prodconsumer=new ProducerConsumer();
		prodconsumer.init();
	}
	public ProducerConsumer(){
		queue=new LinkedBlockingQueue(3);
	}
	public void init(){
		for(int i=0;i<10;i++){
			new Thread(new Object()+"Producer-1 of iteration"+i).start();
			new Thread(new Object()+"Producer-2 of iteration"+i).start();
			new Thread(new Object()+"Producer-3 of iteration"+i).start();
			
			new Thread(new Object()+"Producer-1 of iteration"+i).start();
			new Thread(new Object()+"Producer-2 of iteration"+i).start();
			new Thread(new Object()+"Producer-3 of iteration"+i).start();
		}try{
			Thread.sleep(1000);
		}catch(InterruptedException e){
			
		}
	}

}

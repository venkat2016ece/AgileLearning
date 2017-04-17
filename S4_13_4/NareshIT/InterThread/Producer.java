package S4_13_4.NareshIT.InterThread;

public class Producer implements Runnable{
	Factory fa;
	Producer(Factory fa){ 
		this.fa=fa;
		new Thread(this,"producer").start();
		
	}
	@Override
	public void run() {
		int i=1;
		while(i<=6){
			fa.produce(i++);
		}
	}

}

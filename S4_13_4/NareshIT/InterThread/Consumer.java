package S4_13_4.NareshIT.InterThread;

public class Consumer implements Runnable {
	Factory fa;
	public Consumer(Factory fa){
		this.fa=fa;
		new Thread(this,"consumer").start();
	}
	@Override
	public void run() {
		int i=1;
		while(i<=10){
			fa.consume();
			i++;
		}
	}

}

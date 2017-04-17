package S4_13_4.NareshIT.java9s.A.Yeild;

public class YeildRunnable implements Runnable{

	@Override
	public void run() {
		System.out.println("currentThread:"+Thread.currentThread().getName()+"Priority"+Thread.currentThread().getPriority());
	Thread.yield();
	System.out.println("currentThraed:"+Thread.currentThread().getName()+"priority"+Thread.currentThread().getPriority()+"End");
	}

}

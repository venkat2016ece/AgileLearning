package S4_13_4.NareshIT.Synchronizationandlocks;

public class MyThread extends Thread {
	Display d;
	String name;
	public MyThread(Display d,String name) {
	
				this.d=d;
				this.name=name;
}   
	@Override
	public void run(){
		d.wish(name);
	}
}

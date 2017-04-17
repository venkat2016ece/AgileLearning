package S4_13_4.NareshIT.Synchronizationandlocks;

public class synchronizationDemo {

	public static void main(String[] args) {
		Display d= new Display();
		MyThread mt1=new MyThread(d,"venkat");
		
		MyThread mt2=new MyThread(d,"ravi");
		mt1.start();
		mt2.start();

	}

}

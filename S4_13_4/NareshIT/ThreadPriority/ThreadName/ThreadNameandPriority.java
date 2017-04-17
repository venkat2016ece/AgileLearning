package S4_13_4.NareshIT.ThreadPriority.ThreadName;

public class ThreadNameandPriority {
	public static void main(String[] args) {
		MyThread mt1=new MyThread();
		System.out.println("mt1 thread's intial named and priority");
		System.out.println(mt1.getName());
		System.out.println(mt1.getPriority());
		MyThread mt12=new MyThread("NIIT");
		System.out.println("mt12 thread's intial named and priority");
		System.out.println(mt12.getName());
		System.out.println(mt12.getPriority());
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		mt1.setPriority(5);
		mt12.setPriority(8);
		System.out.println(mt1.getPriority());
		System.out.println(mt12.getPriority());
		mt1.start();
		mt12.start();
		
	}

}

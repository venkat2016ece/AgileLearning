package S4_13_4.NareshIT.OverloadingRunMethod;

public class ThreadDemo {
	public static void main(String[] args) {
		MyThread t=new MyThread();
		t.start();
		System.out.println("****************");
		for(int i=0;i<10;i++){
			System.out.println("main Thread");
		}
	}

}

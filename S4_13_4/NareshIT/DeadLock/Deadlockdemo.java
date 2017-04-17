package S4_13_4.NareshIT.DeadLock;

public class Deadlockdemo implements Runnable {
	A a=new A();
	B b=new B();
	Deadlockdemo(){
		Thread t=new Thread();
		t.start();
		a.m1(b);//this is exicuted by main thread
	}
	public void run(){
		 b.m1(a);//exicuted by child thread
	}

	public static void main(String[] args) {
		new Deadlockdemo();
		
	}

}

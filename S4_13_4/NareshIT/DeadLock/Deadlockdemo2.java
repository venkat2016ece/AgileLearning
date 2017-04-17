package S4_13_4.NareshIT.DeadLock;

public class Deadlockdemo2 implements Runnable {
	A a=new A();
	B b=new B();
	Deadlockdemo2(){
		Thread t=new Thread(this);
		t.start();
		t.stop();
		a.m1(b);//by main 
		
	}
	public void run() {
		b.m1(a);//by child
	}
	public static void main(String[] args) {
		new Deadlockdemo2();
	}

}

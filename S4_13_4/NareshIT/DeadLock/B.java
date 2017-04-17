package S4_13_4.NareshIT.DeadLock;

public class B {
	public synchronized void m1(A a){
		System.out.println("thread1 starts B exicuting of m1() method ");
		try{
			Thread.sleep(10);
		}catch(Exception e){
			System.out.println("Thread trying to cahe block");
		}
		public synchronized void m2(){
			System.out.println("inside B this is m2() method");
		}
	}

}

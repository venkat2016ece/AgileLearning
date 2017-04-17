package S4_13_4.NareshIT.DeadLock;

import java.lang.annotation.Target;

public class A {
	public synchronized void m1(B b)
	{
		System.out.println("thread1 starts A exicuting of m1() method ");
		try{
			Thread.sleep(100);
		}catch(Exception e){
			System.out.println("Thread trying to cahe block");
		}
		public synchronized void m2(){
			System.out.println("inside A this is m2() method");
		}
	
	}

}

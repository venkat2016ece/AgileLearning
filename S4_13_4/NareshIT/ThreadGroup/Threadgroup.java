package S4_13_4.NareshIT.ThreadGroup;

public class Threadgroup extends Thread{
	public String toString(){
		return "Thread["+getName()+getPriority()+","+getThreadGroup()+"]";
		
	}
	public static void main(String[] args) {
		Thread t1=new Thread();
		System.out.println(t1);
		Thread t2=new Thread("NIIT");
		System.out.println(t2);
		//Thread t3=new Thread.currentThread();
		Thread t3=new Thread();
		System.out.println(t3);
		t3.setPriority(9);
		Thread t4=new Thread();
		System.out.println(t4);
		
	}

}

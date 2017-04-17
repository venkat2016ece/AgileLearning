package S4_13_4.NareshIT.java9s.A.Join;

import java.lang.Thread.State;

public class JoinDemo {
	public static Thread firstThread;
	public static Thread secondThread;
	public static void main(String[] args) {
		JoinThread jt=new JoinThread();
		firstThread=new Thread(jt,"firstThread");
		secondThread=new Thread(jt,"secondThread");
		firstThread.start();
		while(true){
			State firstThreadStatus=firstThread.getState();
			State secondThreadStatus=secondThread.getState();
			System.out.println(System.nanoTime()+"FirstThread Status:"+firstThreadStatus);
			System.out.println(System.nanoTime()+"SecondThread Status:"+secondThreadStatus);
			if(firstThreadStatus.equals(State.TERMINATED)&&secondThread)
		}
	}

}

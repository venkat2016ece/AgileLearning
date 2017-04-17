package S4_13_4.NareshIT.OverloadingRunMethod.Start;

import java.nio.charset.MalformedInputException;

/*
 * if we override start method then our start method will be exicuted just like a 
 * normal method call and no new thread will be created*/

public class MyThread extends Thread{
	public void start(){
		for(int i=0;i<10;i++){
			System.out.println("start method");
		}
		
	}
public static void main(String[] args) {
	MyThread t=new MyThread();
	t.start();
	
}
}

package S4_10_4.Multithreading.join.SecondDemo;

public class MyThread extends Thread{
	public void run(){
		try{
			Thread mt = null;
			mt.join();
		}catch(InterruptedException e){
			
		}
		for(int i=0;i<10;i++){
			System.out.println("child thread");
		}
	}

}

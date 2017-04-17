package S4_10_4.Multithreading.join;

public class MyThread extends Thread {
  public void run(){
	  for(int i=0;i<10;i++){
		  System.out.println("venkat thread");
	  }try{
		  Thread.sleep(2000);
	  }catch(InterruptedException e){
		  
	  }
  }
}

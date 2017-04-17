package S4_13_4.NareshIT.Methods;

public class Interrupt extends Thread{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println(getName()+"Run:"+i);
			try{
				Thread.sleep(200);
				}catch(InterruptedException e){
					System.out.println("i am interrupted");
				}
			}
		
	}

	public static void main(String[] args) {
		Interrupt i=new Interrupt();
		i.start();
		i.interrupt();
		System.out.println("end of main thread");

	}

}

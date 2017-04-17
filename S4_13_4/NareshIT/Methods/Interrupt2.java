package S4_13_4.NareshIT.Methods;

public class Interrupt2 extends Thread{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println(getName()+"Run:"+i);
			try{
				Thread.sleep(100);
				}catch(InterruptedException e){
					System.out.println("i am interrupted");
				}
			}
	}

	public static void main(String[] args) {
		Interrupt2 i=new Interrupt2();
		i.start();
		i.interrupt();
		System.out.println("end of main thread");
		for(int i1=0;i1<10;i1++){
			System.out.println("main");
			
		}
	}
	}

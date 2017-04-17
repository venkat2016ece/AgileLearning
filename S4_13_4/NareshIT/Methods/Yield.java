package S4_13_4.NareshIT.Methods;

public class Yield extends Thread{
	public void run(){
		for(int i=0;i<10;i++){
			Thread.yield();
			System.out.println(getName()+"Run:"+i);
		}
	}

	public static void main(String[] args) {
		Yield y=new Yield();
		y.start();
		for(int i=0;i<10;i++){
			System.out.println("main thread"+i);
		}
	}

}

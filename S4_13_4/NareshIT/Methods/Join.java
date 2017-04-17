package S4_13_4.NareshIT.Methods;

public class Join extends Thread {
	public void run()
	{
		for(int i=0;i<10;i++){
			System.out.println(getName()+"Run:"+i);
			try{
				Thread.sleep(2000);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Join j=new Join();
		j.start();
		j.join();
		for(int i=0;i<10;i++){
			System.out.println("main thread"+i);
		}
	}
}

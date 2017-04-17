package S4_13_4.NareshIT.DeamonThread;

public class MyDaemon extends Thread {
	public void run(){
		for(int i=0;i<4;i++){
			System.out.println("lazy thread");
		}try{
			Thread.sleep(100);
		}catch(Exception e){
			System.out.println("interrupted exception");
		}
	}
	public static void main(String[] args) {
		MyDaemon myd=new MyDaemon();
			myd.setDaemon(true);
			myd.start();
			System.out.println("end of main thread");
				for(int i=0;i<10;i++){
					System.out.println("main thread");
				}
	}

}

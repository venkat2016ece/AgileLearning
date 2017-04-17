package S4_13_4.NareshIT.Methods;

public class Sleep extends Thread {
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println(getName()+"Run:"+i);
			try{
				Thread.sleep(2000);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		Sleep s=new Sleep();
		s.start();
		for(int i=0;i<10;i++){
			System.out.println("main thread"+i);
		}
	}
}

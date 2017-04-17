package S4_13_4.NareshIT.Synchronizationandlocks;

public class Display {
	public synchronized void wish(String name){
		for(int i=0;i<4;i++){
			System.out.println("welcome to NIIT");
			try{
				Thread.sleep(10000);
			}catch(Exception e){
				System.out.println(e);
			}
			System.out.println(name);
		}
	}

}

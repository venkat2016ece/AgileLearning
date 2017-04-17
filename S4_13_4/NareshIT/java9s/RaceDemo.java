package S4_13_4.NareshIT.java9s;

public class RaceDemo {

	public static void main(String[] args) {
		Racer racer=new Racer();
		Thread tortoiseThread=new Thread(racer,"Tortoise");
		Thread hareThread=new Thread(racer,"hareThread");
		//race to start tell thread to start();
		tortoiseThread.start();
		hareThread.start();
	}

}

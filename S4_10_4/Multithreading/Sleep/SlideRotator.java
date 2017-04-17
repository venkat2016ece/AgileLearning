package S4_10_4.Multithreading.Sleep;

public class SlideRotator {

	public static void main(String[] args) throws InterruptedException {
		for(int i=1;i<=10;i++){
			System.out.println("slide-"+i);
			Thread.sleep(5000);
		}
	}

}

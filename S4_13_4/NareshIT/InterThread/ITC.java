package S4_13_4.NareshIT.InterThread;

public class ITC {

	public static void main(String[] args) {
		Factory f=new Factory();
		new Producer(f);
		new Consumer(f);
	}

}

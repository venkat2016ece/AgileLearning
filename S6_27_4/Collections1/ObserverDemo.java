package S6_27_4.Collections1;

public class ObserverDemo {
	public static void main(String[] args) {
		BeingWatched observed=new BeingWatched();
		Watcher observing=new Watcher();
		observed.addObserver(observing);
		observed.counter(10);
	}

}

package S6_27_4.Collections1;

import java.util.Observable;

public class BeingWatched extends Observable {
	void counter(int period){
		for(;period>=0;period--){
			setChanged();
			notifyObservers(new  Integer(period));
			try{
				Thread.sleep(100);
			}catch(InterruptedException e){
				System.out.println("InterruptedException caught");
			}
		}
	}

}

package S6_27_4.Collections1;

import java.util.Observable;
import java.util.Observer;

public class Watcher implements Observer {

	@Override
	public void update(Observable obj, Object arg) {
		System.out.println("called the update,the counter is"+((Integer)arg).intValue());
		
	}

}

package lab14_observer;

import java.util.Observable;
import java.util.Observer;

public class AVEngineerUI implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		if (arg instanceof String) {
			String desc = (String) arg;
			System.out.println("Description has changed to " + desc);
		}
	}
}

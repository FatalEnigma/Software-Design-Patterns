package lab14_observer;

import java.util.Observable;
import java.util.Observer;

public class SecurityUI implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		if (arg instanceof Integer) {
			int number = (int) arg;
			System.out.println("Number of participants has changed to " + number);
		}
	}
}

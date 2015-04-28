package lab14_observer_2;

import java.util.Observable;
import java.util.Observer;

public class AVEngineerUI implements MeetingListener {

	@Override
	public void numberOfPartipantsChanged(MeetingEvent event) {
	}

	@Override
	public void descriptionChanged(MeetingEvent event) {
		System.out.println("Description has changed to " + event.getDescription());
	}
}

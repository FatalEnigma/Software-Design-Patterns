package lab14_observer_2;

import java.util.Observable;
import java.util.Observer;

public class SecurityUI implements MeetingListener {

	@Override
	public void numberOfPartipantsChanged(MeetingEvent event) {
		System.out.println("Number of participants changed to " + event.getNumberOfParticipants());
		
	}

	@Override
	public void descriptionChanged(MeetingEvent event) {
	}

	
}

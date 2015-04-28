package lab14_observer_2;

import java.util.EventListener;

public interface MeetingListener extends EventListener {

	public void numberOfPartipantsChanged(MeetingEvent event);
	public void descriptionChanged(MeetingEvent event);
}

package lab14_observer_2;

import java.util.EventObject;

public class MeetingEvent extends EventObject {
	
	private int numberOfParticipants;
	private String description;

	public int getNumberOfParticipants() {
		return numberOfParticipants;
	}

	public String getDescription() {
		return description;
	}

	public MeetingEvent(Object source, int numberOfParticipants, String description) {
		super(source);
		this.numberOfParticipants = numberOfParticipants;
		this.description = description;
	}
	
	
}

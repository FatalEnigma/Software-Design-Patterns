package lab14_observer_2;

import java.util.ArrayList;

public class Meeting {
	
	int numberOfParticipants;
	String description;
	ArrayList<MeetingListener> listeners;
	
	public Meeting(String description, int numberOfParticipants) {
		this.numberOfParticipants = numberOfParticipants;
		this.description = description;
		listeners = new ArrayList<MeetingListener>();
	}
	public void setNumberOfParticipants(int numberOfParticipants) {
		this.numberOfParticipants = numberOfParticipants;
		fireNumberOfPartipantsChanged();
	}
	public void setDescription(String description) {
		this.description = description;
		fireDescriptionChanged();
	}
	public int getNumberOfParticipants() {
		return numberOfParticipants;
	}
	public String getDescription() {
		return description;
	}
	
	public void addListener(MeetingListener listener) {
		listeners.add(listener);
	}
	
	public void removeListener(MeetingListener listener) {
		listeners.remove(listener);
	}
	
	public void fireDescriptionChanged() {
		MeetingEvent event = new MeetingEvent(this, getNumberOfParticipants(), getDescription());
		
		for (MeetingListener listener : listeners) {
			listener.descriptionChanged(event);
		}
	}
	
	public void fireNumberOfPartipantsChanged() {
		MeetingEvent event = new MeetingEvent(this, getNumberOfParticipants(), getDescription());
		
		for (MeetingListener listener : listeners) {
			listener.numberOfPartipantsChanged(event);
		}
	}
}

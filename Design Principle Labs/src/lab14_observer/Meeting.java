package lab14_observer;
import java.util.Observable;

public class Meeting extends Observable{
	
	private int numberOfParticipants;
	private String description;
	
	public Meeting(String description, int numberOfParticipants) {
		this.numberOfParticipants = numberOfParticipants;
		this.description = description;
	}
	public void setNumberOfParticipants(int numberOfParticipants) {
		this.numberOfParticipants = numberOfParticipants;
		setChanged();
		notifyObservers(numberOfParticipants);
	}
	public void setDescription(String description) {
		this.description = description;
		setChanged();
		notifyObservers(description);
	}
}

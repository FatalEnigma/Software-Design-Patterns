package lab14_observer_2;

public class TestObservers {

	public static void main(String[] args) {
		Meeting s = new Meeting("Scrum Meeting", 5);
		AVEngineerUI avEngUI = new AVEngineerUI();
		SecurityUI secUI = new SecurityUI();
		
		s.addListener(avEngUI);
		s.addListener(secUI);
		
		s.setDescription("New Description");
		s.setNumberOfParticipants(10);
	}
}

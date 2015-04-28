package lab2_abstract_family;

public class WiredDoorSensor implements IDoorSensor {

	@Override
	public void detect() {
		System.out.println("WIRED door sensor started");
	}

}

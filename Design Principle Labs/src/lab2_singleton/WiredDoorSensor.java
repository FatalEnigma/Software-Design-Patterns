package lab2_singleton;

public class WiredDoorSensor implements IDoorSensor {

	@Override
	public void detect() {
		System.out.println("WIRED door sensor started");
	}

}

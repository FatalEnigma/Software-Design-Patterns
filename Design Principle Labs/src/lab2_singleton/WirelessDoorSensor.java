package lab2_singleton;

public class WirelessDoorSensor implements IDoorSensor {

	@Override
	public void detect() {
		System.out.println("WIRELESS door sensor started");
	}

}

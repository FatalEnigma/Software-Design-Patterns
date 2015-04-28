package lab2_abstract_family;

public class WirelessDoorSensor implements IDoorSensor {

	@Override
	public void detect() {
		System.out.println("WIRELESS door sensor started");
	}

}

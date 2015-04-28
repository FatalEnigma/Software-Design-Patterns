package lab2_singleton;

public class WirelessHeaterSensor implements IHeaterSensor {

	@Override
	public void measure() {
		System.out.println("WIRELESS heater sensor started");
	}

}

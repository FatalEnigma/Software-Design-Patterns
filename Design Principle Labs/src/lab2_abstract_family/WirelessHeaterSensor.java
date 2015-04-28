package lab2_abstract_family;

public class WirelessHeaterSensor implements IHeaterSensor {

	@Override
	public void measure() {
		System.out.println("WIRELESS heater sensor started");
	}

}

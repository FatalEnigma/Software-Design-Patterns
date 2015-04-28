package lab2_singleton;

public class WiredHeaterSensor implements IHeaterSensor {

	@Override
	public void measure() {
		System.out.println("WIRED heater sensor started");
	}

}

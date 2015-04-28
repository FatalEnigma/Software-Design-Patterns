package lab2_singleton;

public class WiredSensorFactory implements ISensorFactory {
	
	public WiredSensorFactory () {
		System.out.println("WIRED Sensor Factory\n===============");
	}
	
	public WiredDoorSensor createDoorSensor() {
		System.out.println("Door sensor created for a WIRED system");
		return new WiredDoorSensor();
	}
	
	public WiredHeaterSensor createHeaterSensor() {
		System.out.println("Heater sensor created for a WIRED system");
		return new WiredHeaterSensor();
	}
}

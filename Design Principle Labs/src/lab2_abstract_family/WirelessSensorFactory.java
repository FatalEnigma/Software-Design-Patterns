package lab2_abstract_family;

public class WirelessSensorFactory implements ISensorFactory {
	
	public WirelessSensorFactory () {
		System.out.println("WIRELESS Sensor Factory\n===============");
	}
	
	public WirelessDoorSensor createDoorSensor() {
		System.out.println("Door sensor created for WIRELESS system");
		return new WirelessDoorSensor();
	}
	
	public WirelessHeaterSensor createHeaterSensor() {
		System.out.println("Heater sensor created for WIRELESS system");
		return new WirelessHeaterSensor();
	}
}

package lab2_singleton;

public class WirelessSensorFactory implements ISensorFactory {
	
	private static WirelessSensorFactory singleton;
	
	private WirelessSensorFactory () {
		System.out.println("WIRELESS Sensor Factory\n===============");
	}
	
	public static synchronized WirelessSensorFactory getWirelessFactory() {
		if (singleton == null) {
			singleton = new WirelessSensorFactory();
		}
		
		return singleton;
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

package lab2_singleton;

public class SensorController {
	
	IDoorSensor doorSensor;
	IHeaterSensor heaterSensor;
	
	public SensorController (ISensorFactory iSensorFactory) {
		doorSensor = iSensorFactory.createDoorSensor();
		heaterSensor = iSensorFactory.createHeaterSensor();
	}
	
	public void start () {
		doorSensor.detect();
		heaterSensor.measure();
	}
}

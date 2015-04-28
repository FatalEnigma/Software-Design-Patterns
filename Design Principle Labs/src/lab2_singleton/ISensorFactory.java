package lab2_singleton;

public abstract interface ISensorFactory {
	
	public abstract IDoorSensor createDoorSensor();
	public abstract IHeaterSensor createHeaterSensor();
}

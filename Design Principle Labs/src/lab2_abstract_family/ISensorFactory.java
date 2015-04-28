package lab2_abstract_family;

public abstract interface ISensorFactory {
	
	public abstract IDoorSensor createDoorSensor();
	public abstract IHeaterSensor createHeaterSensor();
}

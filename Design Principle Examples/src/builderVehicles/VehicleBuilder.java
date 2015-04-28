package builderVehicles;

public interface VehicleBuilder {
	
	public void buildChassis();
	public void buildEngine();
	public void buildWheels();
	public Vehicle getVehicle();

}

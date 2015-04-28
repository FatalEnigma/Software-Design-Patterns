package builderVehicles;

public class ConcreteVehicleDirector extends VehicleDirector {

	@Override
	public Vehicle build(VehicleBuilder vehicleBuilder) {
		vehicleBuilder.buildChassis();
		vehicleBuilder.buildEngine();
		vehicleBuilder.buildWheels();
		
		return vehicleBuilder.getVehicle();
	}

}

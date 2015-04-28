package builderVehicles;

public class Runner {

	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		
		VehicleBuilder vehicleBuilder = new CarBuilder(vehicle);
		VehicleDirector vehicleDirector = new ConcreteVehicleDirector();
		
		Vehicle newVehicle = vehicleDirector.build(vehicleBuilder);
		System.out.println(newVehicle.getChassis());
		System.out.println(newVehicle.getEngine());
		System.out.println(newVehicle.getWheels());
		
		vehicleBuilder = new VanBuilder(vehicle);
		
		newVehicle = vehicleDirector.build(vehicleBuilder);
		System.out.println(newVehicle.getChassis());
		System.out.println(newVehicle.getEngine());
		System.out.println(newVehicle.getWheels());
	}

}

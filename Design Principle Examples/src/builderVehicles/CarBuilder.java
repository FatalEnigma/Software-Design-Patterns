package builderVehicles;

public class CarBuilder implements VehicleBuilder {

	Vehicle carInProgress;
	
	public CarBuilder(Vehicle carInProgress) {
		this.carInProgress = carInProgress;
	}
	
	@Override
	public void buildChassis() {
		System.out.println("Building chassis for car");
		carInProgress.setChassis("Car chassis");
	}

	@Override
	public void buildEngine() {
		System.out.println("Building engine for car");
		carInProgress.setEngine("Car engine");
	}

	@Override
	public void buildWheels() {
		System.out.println("Build wheels for car");
		carInProgress.setWheels("Car wheels");
	}

	@Override
	public Vehicle getVehicle() {
		return carInProgress;
	}

}

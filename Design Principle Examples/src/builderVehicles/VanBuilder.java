package builderVehicles;

public class VanBuilder implements VehicleBuilder {

	Vehicle vanInProgress;
	
	public VanBuilder(Vehicle vanInProgress) {
		this.vanInProgress = vanInProgress;
	}
	
	@Override
	public void buildChassis() {
		System.out.println("Building chassis for van");
		vanInProgress.setChassis("Van chassis");
	}

	@Override
	public void buildEngine() {
		System.out.println("Building engine for van");
		vanInProgress.setEngine("Van engine");
	}

	@Override
	public void buildWheels() {
		System.out.println("Building wheels for van");
		vanInProgress.setWheels("Van wheels");
	}

	@Override
	public Vehicle getVehicle() {
		return vanInProgress;
	}

}

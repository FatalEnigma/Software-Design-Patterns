package abstractFamilyVehicles;

public abstract class AbstractVehicleFactory {

	public abstract Body createBody();
	public abstract Window createWindows();
	public abstract Chassis createChassis();

}

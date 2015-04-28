package abstractFamilyVehicles;

public class CarFactory extends AbstractVehicleFactory {

	@Override
	public Body createBody() {
		// TODO Auto-generated method stub
		return new CarBody();
	}

	@Override
	public Window createWindows() {
		// TODO Auto-generated method stub
		return new CarWindow();
	}

	@Override
	public Chassis createChassis() {
		// TODO Auto-generated method stub
		return new CarChassis();
	}

	

}

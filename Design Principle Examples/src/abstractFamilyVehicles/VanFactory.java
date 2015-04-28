package abstractFamilyVehicles;

public class VanFactory extends AbstractVehicleFactory {

	@Override
	public Body createBody() {
		// TODO Auto-generated method stub
		return new VanBody();
	}

	@Override
	public Window createWindows() {
		// TODO Auto-generated method stub
		return new VanWindow();
	}

	@Override
	public Chassis createChassis() {
		// TODO Auto-generated method stub
		return new VanChassis();
	}

	

}

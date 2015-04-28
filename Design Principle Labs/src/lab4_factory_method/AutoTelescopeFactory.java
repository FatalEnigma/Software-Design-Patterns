package lab4_factory_method;

public class AutoTelescopeFactory extends TelescopeFactory {

	@Override
	protected Telescope createTelescope(String type) {
		// TODO Auto-generated method stub
		if (type.equalsIgnoreCase("AutoAnySkyTelescope")) {
			return new AutoAnySkyTelescope();
		}
		else if (type.equalsIgnoreCase("AutoAnySkyPlusTelescope")) {
			return new AutoAnySkyPlusTelescope();
		}
		else if (type.equalsIgnoreCase("AutoAnySuperSkyTelescope")) {
			return new AutoAnySuperSkyTelescope();
		}
		
		return new AutoAnySkyPlusTelescope();
	}

}

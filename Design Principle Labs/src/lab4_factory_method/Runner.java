package lab4_factory_method;

public class Runner {
	
	public static void main(String[] args) {
		TelescopeFactory factory = new AutoTelescopeFactory();
		
		Telescope telescope = factory.createTelescope("AutoAnySkyTelescope");
		telescope.setCoordinates(new SkyCoordinates(203.2, 93, 220.32));
		System.out.println(telescope.showView());
		
		telescope = factory.createTelescope("AutoAnySkyPlusTelescope");
		telescope.setCoordinates(new SkyCoordinates(203.2, 93, 220.32));
		System.out.println(telescope.showView());
		
		telescope = factory.createTelescope("AutoAnySuperSkyTelescope");
		telescope.setCoordinates(new SkyCoordinates(203.2, 93, 220.32));
		System.out.println(telescope.showView());
	}

}

package lab4_simple_factory;

public class HomeAstronomyRunner {
	
	public static void main(String[] args) {
		HomeAstronomer mySystem = new HomeAstronomer();
		TelescopeSimpleFactory factory = new TelescopeSimpleFactory();
		
		//test case 1
		Telescope telescope = factory.create(TelescopeSimpleFactory.Type.ANYSKYTELESCOPE);
		SkyCoordinates coords = new SkyCoordinates(100.1, 90.3, 13.4);
		telescope.setCoordinates(coords);
		mySystem.start(telescope);
		

		//test case 2
		telescope = factory.create(TelescopeSimpleFactory.Type.ANYSKYPLUSTELESCOPE);
		coords = new SkyCoordinates(90.3, 54.2, 120);
		telescope.setCoordinates(coords);
		mySystem.start(telescope);
		
		
		//test case 3
		telescope = factory.create(TelescopeSimpleFactory.Type.ANYSUPERSKYTELESCOPE);
		coords = new SkyCoordinates(33.3, 66.6, 170.5);
		telescope.setCoordinates(coords);
		mySystem.start(telescope);
		
	}
}


package lab4_simple_factory;

public class AnySuperSkyTelescope implements Telescope {

	private SkyCoordinates coords;
	private String view;
	
	@Override
	public void setCoordinates(SkyCoordinates coordinates) {
		// TODO Auto-generated method stub
		coords=coordinates;
	}

	@Override
	public String showView() {
		// TODO Auto-generated method stub
		view = "AnySuperSkyTelescope showing the view of coordinates: \n\t" + coords.toString();
		return view;
	}

}

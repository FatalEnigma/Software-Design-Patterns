package lab4_factory_method;

public class AutoAnySuperSkyTelescope implements Telescope {

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
		view = "AutoAnySuperSkyTelescope showing the view of coordinates: \n\t" + coords.toString();
		return view;
	}

}

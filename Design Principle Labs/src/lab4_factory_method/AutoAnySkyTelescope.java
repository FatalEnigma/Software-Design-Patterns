package lab4_factory_method;

public class AutoAnySkyTelescope implements Telescope {

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
		view = "AutoAnySkyTelescope showing the view of coordinates: \n\t" + coords.toString();
		return view;
	}

}

package lab6_adapter;

public class XYZCameraAdapter extends AbstractCamera {

	XYZCamera xyzCamera;
	
	public XYZCameraAdapter(XYZCamera xyzCamera) {
		super(xyzCamera.getSensorSize(), false);
		this.xyzCamera = xyzCamera;
	}
	
	@Override
	public String toString() {
		return xyzCamera.toString();
	}

}

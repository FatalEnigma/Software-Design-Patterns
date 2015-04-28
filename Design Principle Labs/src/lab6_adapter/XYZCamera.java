package lab6_adapter;

public class XYZCamera {

    private double megalpixels;
    
    public XYZCamera(double mp) {
        this.megalpixels = mp;
    }
	
    public double getSensorSize() {
        return megalpixels;
    }
 
    
    public String toString() {
        return "NEWCAMERA: " + megalpixels; 
    }
}



package lab6_adapter;

public abstract class AbstractCamera implements Camera {
    private double megapixels;
    private boolean motorised;
 
    public AbstractCamera(double size, boolean hasMotor) {
        this.megapixels = size;
        this.motorised = hasMotor;
    }
 
    public double getMegaPixels() {
        return megapixels;
    }
 
    public boolean motorised() {
        return motorised;
    }
 
    public String toString() {
        return getClass().getSimpleName() +
                " (" + megapixels + ")";
    }
}

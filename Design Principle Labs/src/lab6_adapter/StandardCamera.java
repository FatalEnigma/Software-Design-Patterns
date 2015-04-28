package lab6_adapter;

public class StandardCamera extends AbstractCamera {
    public StandardCamera(double megapixels) {
        super(megapixels, false); // not motorised
    }
}



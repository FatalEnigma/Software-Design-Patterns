package decoratorVehicleOptions;

public class SatNavVehicle extends AbstractVehicleOption {
    public SatNavVehicle(Vehicle vehicle) {
        super(vehicle);
    }
 
    public int getPrice() {
        return decoratedVehicle.getPrice() + 1500;
    }
 
    public void setDestination(String target) {
        // code to set the destination...
    }
}

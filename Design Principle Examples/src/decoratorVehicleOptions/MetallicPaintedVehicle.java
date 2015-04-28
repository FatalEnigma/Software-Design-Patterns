package decoratorVehicleOptions;

public class MetallicPaintedVehicle extends AbstractVehicleOption {
    public MetallicPaintedVehicle(Vehicle vehicle) {
        super(vehicle);
    }
 
    public int getPrice() {
        return decoratedVehicle.getPrice() + 750;
    }
}

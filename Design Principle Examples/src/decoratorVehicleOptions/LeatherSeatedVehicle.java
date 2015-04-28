package decoratorVehicleOptions;

public class LeatherSeatedVehicle extends AbstractVehicleOption {
    public LeatherSeatedVehicle(Vehicle vehicle) {
        super(vehicle);
    }
 
    public int getPrice() {
        return decoratedVehicle.getPrice() + 1200;
    }
}

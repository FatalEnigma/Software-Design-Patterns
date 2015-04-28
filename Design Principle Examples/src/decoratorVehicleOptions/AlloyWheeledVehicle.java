package decoratorVehicleOptions;

public class AlloyWheeledVehicle extends AbstractVehicleOption {
    public AlloyWheeledVehicle (Vehicle vehicle) {
        super(vehicle);
    }
 
    public int getPrice() {
        return decoratedVehicle.getPrice() + 250;
    }
}
package decoratorVehicleOptions;

public class AirConditionedVehicle extends AbstractVehicleOption {
    public AirConditionedVehicle(Vehicle vehicle) {
        super(vehicle);
    }
 
    public int getPrice() {
        return decoratedVehicle.getPrice() + 600;
    }
 
    public void setTemperature(int value) {
        // code to set the temperature...
    }
}

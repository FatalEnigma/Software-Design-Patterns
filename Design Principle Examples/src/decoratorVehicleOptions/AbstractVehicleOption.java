package decoratorVehicleOptions;

public abstract class AbstractVehicleOption extends AbstractVehicle {
    protected Vehicle decoratedVehicle;
 

    public AbstractVehicleOption(Vehicle vehicle) {
        super(vehicle.getEngine(),vehicle.getColour()); //use this constructor to keep colour
        decoratedVehicle = vehicle;
    }
}


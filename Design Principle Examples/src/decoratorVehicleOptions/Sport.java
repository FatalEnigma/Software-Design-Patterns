package decoratorVehicleOptions;

public class Sport extends AbstractCar {
    public Sport(Engine engine) {
        this(engine, Vehicle.Colour.UNPAINTED);
    }
    
 
    public Sport(Engine engine, Vehicle.Colour colour) {
        super(engine, colour);
    }
    
    public int getPrice() {
        return 8000;
    }
}
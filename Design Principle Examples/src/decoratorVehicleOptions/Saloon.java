package decoratorVehicleOptions;

public class Saloon extends AbstractCar {
    public Saloon(Engine engine) {
        this(engine, Vehicle.Colour.UNPAINTED);
    }
 
    public Saloon(Engine engine, Vehicle.Colour colour) {
        super(engine, colour);
    }
 
    public int getPrice() {
        return 6000;
    }
}
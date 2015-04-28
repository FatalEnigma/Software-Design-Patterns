package decoratorVehicleOptions;

public class DecoratorRunner {

	public static void main(String[] args) {
		// Create a blue saloon car...
		Vehicle myCar = new Saloon(new StandardEngine(1300));
		myCar.paint(Vehicle.Colour.BLUE);
		System.out.println(myCar);
		// Add air-conditioning to the car...
		myCar = new AirConditionedVehicle(myCar);
		System.out.println(myCar);
		// Now add alloy wheels...
		myCar = new AlloyWheeledVehicle(myCar);
		System.out.println(myCar);
		// Now add leather seats...
		myCar = new LeatherSeatedVehicle(myCar);
		System.out.println(myCar);
		// Now add metallic paint...
		myCar = new MetallicPaintedVehicle(myCar);
		System.out.println(myCar);
		// Now add satellite-navigation...
		myCar = new SatNavVehicle(myCar);
		System.out.println(myCar);

	}

}

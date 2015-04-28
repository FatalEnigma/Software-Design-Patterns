package singleton;

public class Application {

	public static void main(String[] args) {

		System.out.println("\nUsing traditional singleton");
		SerialNumberGenerator generator =  SerialNumberGenerator.getInstance();
		System.out.println("next serial: " + generator.getNextSerial());
		System.out.println("next serial: " + generator.getNextSerial());
		System.out.println("next serial: " + generator.getNextSerial());

		System.out.println("\nUsing enum singleton");
		System.out.println("next vehicle: " + SerialNumberGeneratorEnumWay.INSTANCE.getNextSerial());
		System.out.println("next vehicle: " + SerialNumberGeneratorEnumWay.INSTANCE.getNextSerial());
		System.out.println("next engine: " + SerialNumberGeneratorEnumWay.INSTANCE.getNextSerial());

		
		System.out.println("\nUsing enum singleton via Multiton object");
		System.out.println("next vehicle: " + MultitonSerials.VEHICLE.getNextSerial());
		System.out.println("next vehicle: " + MultitonSerials.VEHICLE.getNextSerial());
		System.out.println("next engine: " + MultitonSerials.ENGINE.getNextSerial());
		System.out.println("next vehicle: " + MultitonSerials.VEHICLE.getNextSerial());
		System.out.println("next engine: " + MultitonSerials.ENGINE.getNextSerial());

	}

}

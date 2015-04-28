package abstractFamilyVehicles;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		AbstractVehicleFactory abstractVehicleFactory = null;
		
		System.out.print("Enter 1 for car and 2 for van: ");
		int choice = sc.nextInt();
		
		if (choice == 1) {
			abstractVehicleFactory = new CarFactory();
		}
		else if (choice == 2) {
			abstractVehicleFactory = new VanFactory();
		}
		else {
			System.out.println("Unrecognised input!");
		}
		
		Body body = abstractVehicleFactory.createBody();
		Chassis chassis = abstractVehicleFactory.createChassis();
		Window window = abstractVehicleFactory.createWindows();
		
		System.out.println(body.getBodyParts());
		System.out.println(chassis.getChassisParts());
		System.out.println(window.getWindowParts());
		
		sc.close();

	}

}

package lab13_strategy_composite;


public class Game {

	public static void main(String[] args) {
		// simulate a driving game - just at the command line
		System.out.println("Game Starting\n");
		
		Car myCar = new Car();
		System.out.print("\nWhat are you? ");
		myCar.display();
		System.out.print("\nOn the road: ");
		myCar.doDrive();
		System.out.print("\nIn Water: ");
		myCar.doWaterMove();
		
		//change behaviour
		System.out.print("\nOn snow: ");
		myCar.setDrivingBehaviour(new SnowBehaviour());
		myCar.doDrive();
		
	    
		
		//try out composite pattern
		System.out.print("\nOn the road and its snowy: ");
		CompositeLandBehaviour snowyroad = new CompositeLandBehaviour();
		snowyroad.addBehaviour(new RoadBehaviour());
		snowyroad.addBehaviour(new SnowBehaviour());
		snowyroad.addBehaviour(new CrashBehaviour());
		myCar.setDrivingBehaviour(snowyroad);
		myCar.doDrive();
		
		System.out.println("\nGame Over");
	}

}

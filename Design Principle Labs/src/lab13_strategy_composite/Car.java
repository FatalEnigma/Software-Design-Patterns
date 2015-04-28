package lab13_strategy_composite;


public class Car extends Vehicle {

	public Car(){
		drivingBehaviour = new RoadBehaviour();
		iWaterBehaviour = new SinkBehaviour();
	}
	
public void setDrivingBehaviour(ILandBehaviour db){
	drivingBehaviour = db;
}

public void setWaterBehaviour(IWaterBehaviour wb){
	iWaterBehaviour = wb;
}

	@Override
	public void display() {
		System.out.println("I'm a Car");
	}
}

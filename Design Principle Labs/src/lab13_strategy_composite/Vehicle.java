package lab13_strategy_composite;

public abstract class Vehicle {
	ILandBehaviour drivingBehaviour;
	IWaterBehaviour iWaterBehaviour;
	
	public abstract void display();
	
	public void doDrive(){
		drivingBehaviour.drive();
	}
	
	public void doWaterMove(){
		iWaterBehaviour.move();
	}
	
	public void setDrivingBehaviour(ILandBehaviour db){
		drivingBehaviour = db;
	}
	
	public void setDrivingBehaviour(IWaterBehaviour wb){
		iWaterBehaviour = wb;
	}
}

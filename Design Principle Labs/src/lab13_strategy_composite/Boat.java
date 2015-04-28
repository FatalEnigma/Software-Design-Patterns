package lab13_strategy_composite;

public class Boat extends Vehicle{


	public Boat(){
			drivingBehaviour = new RoadBehaviour();
			iWaterBehaviour = new FloatBehaviour();
		}
	
	@Override
	public void display() {
		System.out.println("I am a boat");
	}
		
	public void setDrivingBehaviour(ILandBehaviour db){
		drivingBehaviour = db;
	}

	public void setWaterBehaviour(IWaterBehaviour wb){
		iWaterBehaviour = wb;
	}

	
	
}

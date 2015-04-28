package lab13_strategy_composite;

import java.util.ArrayList;

public class CompositeLandBehaviour implements ILandBehaviour{

	private ArrayList<ILandBehaviour> landBehaviours;
	
	public CompositeLandBehaviour() {
		// TODO Auto-generated constructor stub
		landBehaviours = new ArrayList<ILandBehaviour>();
	}
	
	public void addBehaviour (ILandBehaviour landBehaviour) {
		landBehaviours.add(landBehaviour);
	}
	
	public void removeBehaviour (ILandBehaviour landBehaviour) {
		landBehaviours.remove(landBehaviour);
	}
	
	@Override
	public void drive() {
		
		for (ILandBehaviour behaviour : landBehaviours) {
			behaviour.drive();
		}
	}
}




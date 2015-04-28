package bridge;

public class BridgeTester {

	public static void main(String[] args) {
		Engine standardEngine = new StandardEngine(1800);
		
		SportControls controls = new SportControls(standardEngine);
		
		controls.ignitionOn();
		controls.accelerateHard();
		controls.brake();
		controls.ignitionOff();
	}

}

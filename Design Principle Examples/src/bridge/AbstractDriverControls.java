package bridge;

public abstract class AbstractDriverControls {
	private Engine engine;
	
	public AbstractDriverControls(Engine engine) {
		this.engine = engine;
	}
	
	public void ignitionOn() {
		engine.start();
	}
	
	public void ignitionOff() {
		engine.stop();
	}
	
	public void accelerate() {
		engine.increasePower();
	}
	
	public void brake() {
		engine.decreasePower();
	}

}

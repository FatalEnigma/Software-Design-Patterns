package bridge;

public abstract class AbstractEngine implements Engine {
	private int size;
	private boolean turbo;
	private boolean running;
	private int power;
	

	public AbstractEngine(int size, boolean turbo) {
		super();
		this.size = size;
		this.turbo = turbo;
		this.running = false;
		this.power = 0;
	}

	public int getSize() {
		// TODO Auto-generated method stub
		return size;
	}

	public boolean isTurbo() {
		// TODO Auto-generated method stub
		return turbo;
	}

	public void start() {
		// TODO Auto-generated method stub
		running = true;
		System.out.println("Engine started");

	}

	public void stop() {
		// TODO Auto-generated method stub
		running = false;
		power = 0;
		System.out.println("Engine stopped");

	}

	public void increasePower() {
		// TODO Auto-generated method stub
		if (running && (power < 10)) {
			power++;
			System.out.println("Engine power increased to " + power);
		}

	}

	public void decreasePower() {
		// TODO Auto-generated method stub
		if (running && (power > 0)) {
			power--;
			System.out.println("Engine power decreased to " + power);
		}
	}
	
	public String toString() {
		return getClass().getSimpleName() + " (" + size + ")";
	}

}

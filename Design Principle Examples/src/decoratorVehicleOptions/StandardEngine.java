package decoratorVehicleOptions;

public class StandardEngine implements Engine {
	private int size;
	private boolean turbo=false;
	
	public StandardEngine(int s) {
		size=s;
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public boolean isTurbo() {
		return turbo;
	}
	
	public String toString(){
		return ("(" + size + ")");
	}
}

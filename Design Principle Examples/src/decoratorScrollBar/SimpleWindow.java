package decoratorScrollBar;

public class SimpleWindow implements Window {

	public void draw() {
		// steps to draw a window
		System.out.println("... Drawing a Simple Window - no decoration");
	}

	public String getDescription() {
		return "simple window - no decoration";
	}

}

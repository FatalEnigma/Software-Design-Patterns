package decoratorScrollBar;

public class VerticalScrollBarDecorator extends WindowDecorator  {    
	
	public VerticalScrollBarDecorator (Window decoratedWindow) {
		super(decoratedWindow);
		drawVerticalScrollBar();
}

public void draw() {
    drawVerticalScrollBar();
    super.draw();
}

private void drawVerticalScrollBar() {
	System.out.println("... Drawing a vertical scroll bar on window");
}

public String getDescription() {
    return decoratedWindow.getDescription() + ", decorated with vertical scrollbars";
}
}

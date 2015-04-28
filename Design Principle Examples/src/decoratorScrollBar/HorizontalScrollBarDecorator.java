package decoratorScrollBar;

public class HorizontalScrollBarDecorator extends WindowDecorator{

    public HorizontalScrollBarDecorator (Window decoratedWindow) {
        super(decoratedWindow);
        drawHorizontalScrollBar();

    }
 
    public void draw() {
        drawHorizontalScrollBar();
        super.draw();
    }
 
    private void drawHorizontalScrollBar() {
        System.out.println("... Drawing a horizontal scroll bar on window");
    }
 
    public String getDescription() {
        return decoratedWindow.getDescription() + ", decorated with horizontal scrollbars";
    }
}

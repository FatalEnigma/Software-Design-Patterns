package decoratorScrollBar;

abstract class WindowDecorator implements Window {

	protected Window decoratedWindow; //ref to window being decorated
	
    public WindowDecorator (Window decoratedWindow) {
        this.decoratedWindow = decoratedWindow;
    }
    
    public void draw() {
        decoratedWindow.draw();
    }


}

package decoratorScrollBar;

public class DecoratedWindowTest {

    public static void main(String[] args) {
    	// 1. demo of a simple window
    	System.out.println("1. Test Simple Window");
    	Window w = new SimpleWindow();
        System.out.println(w.getDescription()+ "\n" );    	
    	
    	// 2. demo of  a decorated Window with horizontal scrollbars
    	System.out.println("2. Test Window with horizontal scrollbars");
        Window h_decoratedWindow = new HorizontalScrollBarDecorator (
        				new SimpleWindow());
        System.out.println(h_decoratedWindow.getDescription()+ "\n" );  
    	
        
    	// 3. demo of  a decorated Window with vertical scrollbars
    	System.out.println("3. Test Window with vertical scrollbars");
        Window v_decoratedWindow = new VerticalScrollBarDecorator (
        				new SimpleWindow());
        System.out.println(v_decoratedWindow.getDescription()+ "\n" ); 
        
        
    	// 4. demo of  a decorated Window with horizontal and vertical scrollbars
        System.out.println("4. Test Window with horizontal and vertical scrollbars");
        Window hv_decoratedWindow = new HorizontalScrollBarDecorator (
        				new VerticalScrollBarDecorator(new SimpleWindow()));
        System.out.println(hv_decoratedWindow.getDescription()+ "\n" );
    }
}
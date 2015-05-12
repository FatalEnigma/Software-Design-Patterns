package domain;

public class MobileRobot implements Robot {
	
    private Processor processor;
    private Robot.Colour colour;
    
    public MobileRobot(Processor p) {
        this(p, Robot.Colour.UNPAINTED);
    }
    public MobileRobot(Processor p, Robot.Colour colour) {
        this.processor = p;
        this.colour = colour;
    } 
 
    @Override
	public Processor getProcessor() {
        return processor;
    }
 
    @Override
	public Robot.Colour getColour() {
        return colour;
    }
 
    @Override
	public void paint(Robot.Colour colour) {
        this.colour = colour;
    }
 
    @Override
	public String toString() {
        return getClass().getSimpleName() + " (" + processor + ", " + colour + ")";
    }    
    
    
    
}

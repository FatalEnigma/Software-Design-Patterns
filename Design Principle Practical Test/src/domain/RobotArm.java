package domain;

public class RobotArm implements Robot {
	
    private Processor processor;
    private Robot.Colour colour;
    
    
    public RobotArm(Processor p) {
        this(p, Robot.Colour.UNPAINTED);
    }
 
    public RobotArm(Processor p, Robot.Colour colour) {
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

package domain;

import java.util.List;

public class CompositeRobot implements Robot {

    private Processor processor;
    private Robot.Colour colour;
    private List<Robot> parts;
    
    public CompositeRobot(Processor p, List<Robot> parts) {
    	this(p, Robot.Colour.UNPAINTED, parts);
	}
	
	public CompositeRobot(Processor p, Robot.Colour colour, List<Robot> parts) {
		this.processor = p;
		this.colour = colour;
		this.parts = parts;
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

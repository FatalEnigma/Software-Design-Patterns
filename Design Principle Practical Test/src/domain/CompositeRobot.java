package domain;

import java.util.List;

public class CompositeRobot implements Robot {

    private Processor processor;
    private Robot.Colour colour;
    private List<Robot> robots;
    
    public CompositeRobot(Processor p, List<Robot> robots) {
    	this(p, Robot.Colour.UNPAINTED, robots);
	}
	
	public CompositeRobot(Processor p, Robot.Colour colour, List<Robot> parts) {
		this.processor = p;
		this.colour = colour;
		this.robots = parts;
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
	
	public void addRobot(Robot robot) {
		robots.add(robot);
	}
	
	public void removeRobot(Robot robot) {
		robots.remove(robot);
	}
	
	public Robot[] getRobots() {
		return robots.toArray(new Robot[robots.size()]);
	}
	
    @Override
	public String toString() {
        return getClass().getSimpleName() + " (" + processor + ", " + colour + ")";
    }  
	
}

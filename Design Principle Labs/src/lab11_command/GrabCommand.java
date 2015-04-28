package lab11_command;

public class GrabCommand implements Command {

	private Robot robot;
	
	public GrabCommand(Robot robot) {
		this.robot = robot;
	}
	
	@Override
	public void execute() {
		System.out.println("(ConcreteCommand)GrabCommand: Robot asked to grab");
		robot.grab();
	}

	@Override
	public void setRobotModel(Robot model) {
		this.robot = model;
	}

}

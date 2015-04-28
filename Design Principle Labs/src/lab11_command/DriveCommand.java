package lab11_command;

public class DriveCommand implements Command {

	private Robot robot;
	
	public DriveCommand(Robot robot) {
		this.robot = robot;
	}
	
	@Override
	public void execute() {
		System.out.println("(ConcreteCommand)DriveCommand: Robot asked to drive");
		robot.drive();

	}

	@Override
	public void setRobotModel(Robot model) {
		this.robot = model;
	}

}

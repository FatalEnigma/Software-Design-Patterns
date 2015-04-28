package lab11_command;

public class RobotController {

	public void fireCommand(Command command) {
		System.out.println("Invoker: Calling command " + command.getClass().getSimpleName());
		command.execute();
	}
}

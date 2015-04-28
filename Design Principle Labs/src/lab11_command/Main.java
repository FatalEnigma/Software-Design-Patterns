package lab11_command;

public class Main {

    public static void main( String[] args ) {

        Robot robotModel = new Robot();

        RobotController robotControl = new RobotController();
        GrabCommand grab = new GrabCommand(robotModel);
        DriveCommand drive = new DriveCommand(robotModel);
        
        robotControl.fireCommand(grab);

       // test 2
        robotControl.fireCommand(drive);


    }

}

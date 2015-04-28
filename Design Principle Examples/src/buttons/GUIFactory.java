package buttons;

public abstract class GUIFactory {

    public static GUIFactory getFactory() {
        int sys = readFromConfigFile("OS_TYPE");
        if (sys == 0) {
            return new WinFactory();
        } else {
            return new OSXFactory();
        }
    }

    private static int readFromConfigFile(String string) {
		// TODO write this to read in from an external source
		return 1; //0 for Win, 1 for OSX
	}

	public abstract Button createButton();
}
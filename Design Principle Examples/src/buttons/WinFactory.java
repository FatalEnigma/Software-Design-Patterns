package buttons;

public class WinFactory extends GUIFactory {
    public Button createButton() {
        return new WinButton();
    }
}

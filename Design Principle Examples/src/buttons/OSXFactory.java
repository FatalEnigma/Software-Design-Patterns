package buttons;

public class OSXFactory extends GUIFactory {
    public Button createButton() {
        return new OSXButton();
    }
}


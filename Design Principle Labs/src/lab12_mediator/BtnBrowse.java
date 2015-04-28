package lab12_mediator;

import java.awt.event.ActionListener;
 
import javax.swing.JButton;

class BtnBrowse extends JButton implements Command {
 
    Mediator med;
 
    public BtnBrowse(ActionListener al, Mediator m) {
        super("Browse");
        this.addActionListener(al);
        med = m;
        med.registerBrowseButton(this);
    }
 
    public void execute() {
        med.browseClicked();
    }
}

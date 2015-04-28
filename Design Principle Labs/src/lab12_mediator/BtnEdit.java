package lab12_mediator;

import java.awt.event.ActionListener;
 
import javax.swing.JButton;

class BtnEdit extends JButton implements Command {
 
    Mediator med;
 
    public BtnEdit(ActionListener al, Mediator m) {
	    super("Edit");
	    this.setEnabled(true);
	    addActionListener(al);
	    med = m;
	    med.registerEditButton(this);
    }
 
    public void execute() {
        med.editClicked();
    }
}

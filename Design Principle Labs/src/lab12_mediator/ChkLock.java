package lab12_mediator;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;

public class ChkLock extends JCheckBox implements Command  {
    Mediator med;
    
    public ChkLock(ActionListener al, Mediator m) {
        super("Lock");
        addActionListener(al);
        med = m;
        med.registerLockCheckBox(this);
        this.setSelected(false);
    }

	@Override
	public void execute() {
		if(this.isSelected())
			med.lockSelected();
		else
			med.unlockUnselected();
		
	}
}

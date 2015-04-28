package lab12_mediator;

import java.awt.event.ActionListener;
 
import javax.swing.JButton;

class BtnSearch extends JButton implements Command {
 
    Mediator med;
 
    public BtnSearch(ActionListener al, Mediator m) {
        super("Search");
        addActionListener(al);
        med = m;
        med.registerSearchButton(this);
    }
 
    public void execute() {
        med.searchClicked();
    }
 
}
 

 
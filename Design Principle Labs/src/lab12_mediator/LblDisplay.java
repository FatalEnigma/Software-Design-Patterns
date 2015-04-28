package lab12_mediator;

import java.awt.Font;

import javax.swing.JLabel;

class LblDisplay extends JLabel {
 
    private Mediator med;
 
    public LblDisplay(Mediator m) {
        super("Choose an option:");
        med = m;
        med.registerDisplayLabel(this);
    }
}
package lab12_mediator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
 
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.io.IOException;

import javax.swing.JCheckBox;
import java.awt.Toolkit;
import javax.swing.JTextPane;
import javax.swing.JTextField;


class MediatorExampleRunner extends JFrame implements ActionListener {
 
    Mediator med = new Mediator();
 
    public MediatorExampleRunner() {
        JPanel p = new JPanel();
        p.add(new BtnEdit(this, med));
        p.add(new BtnBrowse(this, med));
        p.add(new BtnSearch(this, med));
        getContentPane().add(new LblDisplay(med), "North");
        getContentPane().add(p, BorderLayout.CENTER);
        p.add(new ChkLock(this, med));

        
// just some look and feel        
    	setIconImage(Toolkit.getDefaultToolkit().getImage("m.png"));        
        setSize(600, 100);
        setTitle("Simple Mediator Example");

        setVisible(true);
    }
 
    public void actionPerformed(ActionEvent ae) {
    	//handle the ActionEvent
        Command comd = (Command) ae.getSource(); //returns the source of the click as comd object
        comd.execute();
    }
 
    public static void main(String[] args) {
        new MediatorExampleRunner();
    }
}
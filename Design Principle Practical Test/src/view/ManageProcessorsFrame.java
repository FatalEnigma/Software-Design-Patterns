package view;

import java.awt.*;
import javax.swing.*;

import domain.*;

public class ManageProcessorsFrame extends JFrame {
    private ManageProcessorsPanel enginesPanel;
   
    public ManageProcessorsFrame () {
        super("Manage Robot Processors");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        add(buildUI(), BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(null);
    }
   
    private Component buildUI() {
        JPanel uiPanel = new JPanel(new BorderLayout());
        enginesPanel = new ManageProcessorsPanel(this); 
        BusinessWrapper.INSTANCE.addProcessorListener(enginesPanel);
        uiPanel.add(enginesPanel, BorderLayout.CENTER);
        return uiPanel;
    }
}

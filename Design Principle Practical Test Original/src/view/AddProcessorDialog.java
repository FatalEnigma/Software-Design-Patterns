package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import domain.*;

public class AddProcessorDialog extends JDialog {
    private JComboBox typeCombo, speedCombo;
   
    AddProcessorDialog(Frame owner) {
        super(owner, "Add Processor", true);
        setLayout(new BorderLayout());
        this.setLocationRelativeTo(owner);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
       
        // Form entry panel
        JPanel formPanel = new JPanel(new GridLayout( 0, 2));
       
        typeCombo = new JComboBox(BusinessWrapper.INSTANCE.getProcessorTypes());
        formPanel.add(new JLabel("Type"));
        formPanel.add(typeCombo);
       
        speedCombo = new JComboBox();
        speedCombo.addItem("450 MHz");
        speedCombo.addItem("550 MHz");
        speedCombo.addItem("1 GHz");
        speedCombo.addItem("1.2 GHz");
        formPanel.add(new JLabel("Speed"));
        formPanel.add(speedCombo);
       
        add(formPanel, BorderLayout.CENTER);
       
        // Buttons to submit or cancel
        JPanel buttonPanel = new JPanel(new FlowLayout());
       
        JButton okButton = new JButton("OK");
        okButton.addActionListener(new ActionListener() {
            @Override
			public void actionPerformed(ActionEvent event) {
                BusinessWrapper.INSTANCE.addProcessor((String)speedCombo.getSelectedItem(), typeCombo.getSelectedItem());
                setVisible(false);
            }
        });
        buttonPanel.add(okButton);
 
        JButton cancelButton = new JButton("Cancel");
        cancelButton.addActionListener(new ActionListener() {
            @Override
			public void actionPerformed(ActionEvent event) {
                setVisible(false);
            }
        });
        buttonPanel.add(cancelButton);
       
        add(buttonPanel, BorderLayout.SOUTH);
        pack();
    }
}
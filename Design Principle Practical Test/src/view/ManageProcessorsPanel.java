package view;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.*;

import domain.*;

import persistence.*;

public class ManageProcessorsPanel extends JPanel implements EntityListener {
    private Frame owner;
    private ProcessorListModel processorsModel;
   
    ManageProcessorsPanel(final Frame owner) {
        super(new BorderLayout());
        this.owner = owner;
       
        // Scrollable list of processors
        processorsModel = new ProcessorListModel();
        add(new JScrollPane(new JList(processorsModel)), BorderLayout.CENTER);
       
        // Buttons to add and save
        JPanel buttonPanel = new JPanel(new FlowLayout());
        
        JButton addProcessorButton = new JButton("Add Processor");
        addProcessorButton.addActionListener(new ActionListener() {
            @Override
			public void actionPerformed(ActionEvent event) {
                new AddProcessorDialog(owner).show();
            }
        });
        buttonPanel.add(addProcessorButton);
 
        JButton saveButton = new JButton("Save");
        saveButton.addActionListener(new ActionListener() {
            @Override
			public void actionPerformed(ActionEvent event) {
                try {
                    BusinessWrapper.INSTANCE.saveProcessors();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(ManageProcessorsPanel.this, ex, "Error", JOptionPane.ERROR_MESSAGE); //DG ListEnginesPanel.this -> ManageProcessorsPanel.this
                }
            }
        });
        buttonPanel.add(saveButton);
 
        JButton restoreButton = new JButton("Restore");
        restoreButton.addActionListener(new ActionListener() {
            @Override
			public void actionPerformed(ActionEvent event) {
                try {
                    BusinessWrapper.INSTANCE.restoreProcessors();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(ManageProcessorsPanel.this, ex, "Error", JOptionPane.ERROR_MESSAGE); //DG ListEnginesPanel.this -> ManageProcessorsPanel.this
                }
            }
        });
        buttonPanel.add(restoreButton);
       
        add(buttonPanel, BorderLayout.SOUTH);
    }
 
    @Override
	public void entityAdded(EntityEvent event) {
        processorsModel.engineAdded(event.getValue());
    }
 
    @Override
	public void entityRestored(EntityEvent event) {
        processorsModel.loadProcessors();
    }
   
    // Inner class: ListModel for processors
    private class ProcessorListModel extends DefaultListModel {
        private java.util.List<Object> processors;
       
        ProcessorListModel() {
            processors = new ArrayList<Object>();
            loadProcessors();
        }
    
    void loadProcessors() {
        processors.clear();
        processors.addAll(Arrays.asList(BusinessWrapper.INSTANCE.getAllProcessors()));
        fireContentsChanged(this, 0, processors.size() - 1);
    }
   
    @Override
	public Object getElementAt(int index) {
        return processors.get(index);
    }
    
    @Override
	public int getSize() {
        return processors.size();
    }
   
    void engineAdded(Object processor) {
        processors.add(processor);
        fireContentsChanged(this, 0, processors.size() - 1);
    }
   
}
}
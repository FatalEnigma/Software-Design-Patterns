package runner;

import view.*;
import javax.swing.*;

import domain.*;

public class Main {
    public static void main(String[] args) {
        // create some sample data
        BusinessWrapper.INSTANCE.addProcessor("450MHz", ProcessorFactory.Type.SINGLECORE);
        BusinessWrapper.INSTANCE.addProcessor("550 MHz", ProcessorFactory.Type.SINGLECORE);
        BusinessWrapper.INSTANCE.addProcessor("1 GHz", ProcessorFactory.Type.SINGLECORE);
        BusinessWrapper.INSTANCE.addProcessor("1.2 GHz", ProcessorFactory.Type.MULTICORE);
       
        // start the view
        SwingUtilities.invokeLater(new Runnable() {
            @Override
			public void run() {
                new ManageProcessorsFrame().setVisible(true);
            }
        });
    }
}
package persistence;

import java.io.*;

public class EntityCSVSave extends AbstractProcessorSave {
    
	String getFileSuffix() {
        return ".csv";
    }
    
    String getFileName(EntityTable table) {
        return table.getClass().getSimpleName();
    }
 
    
	void save(EntityTable table) throws IOException {
        // code to save table data in CSV format (omitted)
    }
 
    
	EntityTable restore(EntityTable table) throws IOException {
        // code to restore table data from CSV format (omitted)
        return table;
    }
}

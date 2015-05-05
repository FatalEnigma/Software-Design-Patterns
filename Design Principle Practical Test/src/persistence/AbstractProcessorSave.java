package persistence;

import java.io.*;

public abstract class AbstractProcessorSave {
    String getFileName(EntityTable table) {
        return table.getClass().getSimpleName();
    }
   
    abstract String getFileSuffix();
    abstract void save(EntityTable table) throws IOException;
    abstract EntityTable restore(EntityTable table) throws IOException;
}

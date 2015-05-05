package domain;


import java.io.*;

import persistence.*;
public enum BusinessWrapper {
    INSTANCE;

   
    public Object[] getProcessorTypes() {
        return ProcessorFactory.Type.values();
    }

    public Object[] getAllProcessors() {
        return DatabaseWrapper.INSTANCE.getAllProcessors();
}

    public Object addProcessor(String speed, Object type) {
        Processor engine = ProcessorFactory.create(speed, type == ProcessorFactory.Type.MULTICORE);
        DatabaseWrapper.INSTANCE.addProcessor(engine);
        return engine;
    }

    public void saveProcessors() throws IOException {
        DatabaseWrapper.INSTANCE.saveProcessors();
    }

    public void restoreProcessors() throws IOException {
        DatabaseWrapper.INSTANCE.restoreProcessors();
    }

    public void addProcessorListener(EntityListener listener) {
        DatabaseWrapper.INSTANCE.addProcessorListener(listener);
    }

    public void removeProcessorListener(EntityListener listener) {
        DatabaseWrapper.INSTANCE.removeProcessorListener(listener);
    }
}

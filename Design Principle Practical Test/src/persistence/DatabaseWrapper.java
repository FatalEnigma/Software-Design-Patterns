package persistence;

import java.io.*;
public enum DatabaseWrapper {
    INSTANCE;

    private EntityTable processors;
    private AbstractProcessorSave persistenceStrategy;

    DatabaseWrapper() {
        processors = new EntityTable(EntityKeyGenerator.PROCESSOR);

        // Set which persistence behaviour to use - just do it in code for this example 
        // but better to read from configuration file

        persistenceStrategy = new EntitySerializationSave();
        //persistenceStrategy = new EntityCSVSave();
    }

    public Object[] getAllProcessors() {
        return processors.getAll().toArray();
    }

    public Object getProcessor(Integer key) {
        return processors.getByKey(key);
    }

    public Integer addProcessor(Object p) {
        return processors.addEntity(p);
    }

    public void addProcessorListener(EntityListener listener) {
        processors.addEntityListener(listener);
    }

    public void removeProcessorListener(EntityListener listener) {
        processors.removeEntityListener(listener);
    }

    public void saveProcessors() throws IOException {
        persistenceStrategy.save(processors);
    }

    public void restoreProcessors() throws IOException {
        EntityTable restoredProcessors = persistenceStrategy.restore(processors);
        processors.restore(restoredProcessors);
    }
}
package domain;
public class ProcessorFactory {
    public enum Type {SINGLECORE, MULTICORE};
   
    // Q7 factory code in here
   
    static Processor create(String size, boolean multicore) {
        return ProcessorFactory.create(multicore ? Type.MULTICORE : Type.SINGLECORE, size);
    }
    
    private ProcessorFactory() {}
}

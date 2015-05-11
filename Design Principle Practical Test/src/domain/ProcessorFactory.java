package domain;
public class ProcessorFactory {
    public enum Type {SINGLECORE, MULTICORE};
   
    // Q7 factory code in here
   
    static Processor create(String size, boolean multicore) {
        return ProcessorFactory.create(multicore ? Type.MULTICORE : Type.SINGLECORE, size);
    }
    
    private ProcessorFactory() {}
    
    public static Processor create (Type processorType, String size) {
		if (processorType == Type.SINGLECORE) {
			return new SingleCoreProcessor(size);
		}
		else if (processorType == Type.MULTICORE) {
			return new MultiCoreProcessor(size);
		}
    	
    	return null;
    }
}

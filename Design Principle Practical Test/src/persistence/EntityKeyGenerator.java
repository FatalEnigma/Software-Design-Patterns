package persistence;

public enum EntityKeyGenerator {
    // Q2. change this class to make EntityKeyGenerator a Singleton using the enum method
	PROCESSOR;
	
    private int nextKey;
    
    public synchronized int getNextKey() {
        return ++nextKey;
    }
}

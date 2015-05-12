package persistence;

public class EntityKeyGenerator {
    // Q2. change this class to make EntityKeyGenerator a Singleton using the enum method

    private int nextKey;
    
    public int getNextKey() {
        return ++nextKey;
    }
}

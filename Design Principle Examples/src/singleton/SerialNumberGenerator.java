package singleton;

public class SerialNumberGenerator {
    // static members
    private static SerialNumberGenerator instance;
    
    public synchronized static SerialNumberGenerator getInstance() {
        if (instance == null) {
            instance = new SerialNumberGenerator();
        }
        return instance;
    }
    
    // instance variables
    private int count;
     
    // private constructor
    private SerialNumberGenerator() {}
    
    // instance methods
    public synchronized int getNextSerial() {
        return ++count;
    }
}


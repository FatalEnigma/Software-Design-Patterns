package singleton;

public enum SerialNumberGeneratorEnumWay {
    INSTANCE;
   
    private int count;
    
    public synchronized int getNextSerial() {
        return ++count;
    }
}

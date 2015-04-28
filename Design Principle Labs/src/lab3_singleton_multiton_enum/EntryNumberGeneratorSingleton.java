package lab3_singleton_multiton_enum;

public enum EntryNumberGeneratorSingleton {
	INSTANCE;
	
	private int number = 999;
	
	public synchronized int getNextNumber() {
		return ++number;
	}

}

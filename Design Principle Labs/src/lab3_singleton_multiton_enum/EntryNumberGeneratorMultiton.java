package lab3_singleton_multiton_enum;

public enum EntryNumberGeneratorMultiton {
	INSTANCE {
		public synchronized int getNextNumber() {
			return ++entryNumber;
		}
	},
	
	REFERENCE {
		public synchronized int getNextNumber() {
			return --referenceNumber;
		}
	};
	
	private static int entryNumber = 999;
	private static int referenceNumber = 100000;
	
	public synchronized int getNextNumber() {
		return ++entryNumber;
	}

}


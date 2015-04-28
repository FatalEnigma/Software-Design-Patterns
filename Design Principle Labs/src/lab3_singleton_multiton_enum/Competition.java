package lab3_singleton_multiton_enum;

public class Competition {

	public static void main (String[] args) {
		System.out.println("Using singleton enum\n=======================");
		for (int x = 0; x < 3; x++) {
			System.out.println("Next entry number: " + EntryNumberGeneratorSingleton.INSTANCE.getNextNumber());	
		}
		
		System.out.println("\nUsing multiton enum\n=======================");
		for (int x = 0; x < 3; x++) {
			System.out.println("Next entry number: " + EntryNumberGeneratorMultiton.INSTANCE.getNextNumber());
			System.out.println("Next reference number: " + EntryNumberGeneratorMultiton.REFERENCE.getNextNumber());
		}
	}
}

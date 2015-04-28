package lab5_builder;

public class Runner {

	public static void main(String[] args) {
		// Test Case 1
		System.out.println("Test Case 1: Printing project writeup");
		DissertationBuilder projectBuilder = new ProjectBuilder();
		DissertationDirector projectDirector = new DissertationDirector(projectBuilder);
		projectDirector.constructDissertation();
		Dissertation project=projectDirector.getDissertation();
		System.out.println("Project " + project.getTitle() + " printed");
		System.out.println("___________________________________\n");
		
		// Test Case 2
		System.out.println("Test Case 2: Printing PhD Thesis");
		DissertationBuilder thesisBuilder = new ThesisBuilder();
		DissertationDirector thesisDirector = new DissertationDirector(thesisBuilder);
		thesisDirector.constructDissertation();
		Dissertation phdThesis=thesisDirector.getDissertation();
		System.out.println("PhD " + phdThesis.getTitle() + " printed");
		System.out.println("___________________________________\n");
	}

}

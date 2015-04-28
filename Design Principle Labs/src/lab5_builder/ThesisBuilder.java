package lab5_builder;

public class ThesisBuilder implements DissertationBuilder {
	private Dissertation dissertation;
	
	public ThesisBuilder () {
		dissertation = new Dissertation();
		System.out.println("Builder for PhD Thesis Created");
	}
	
	public void buildTitlePage() {
		System.out.println("printing PhD title");
		dissertation.setTitle("My PhD");
	}

	public void buildTableOfContents() {
		System.out.println("printing PhD table of contents");
		dissertation.setTableOfContents("PhD table of contents");
	}

	public void buildSummary() {
		System.out.println("printing Phd abstract");
		dissertation.setAbstractText("PhD Abstract");
		
	}

	public void buildChapters() {
		System.out.println("printing Phd Thesis chapters");
		dissertation.setChapters("PhD Thesis chapters");
	}

	public void buildReferences() {
		System.out.println("printing Phd references");
		dissertation.setReferences("PhD References");
	}
	
	public Dissertation getDissertation() {
		return dissertation;
	}

	

}

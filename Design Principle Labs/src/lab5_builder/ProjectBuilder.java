package lab5_builder;

public class ProjectBuilder implements DissertationBuilder {
	private Dissertation dissertation;
	
	public ProjectBuilder() {
		dissertation = new Dissertation();
		System.out.println("Builder for Project WriteUp Created");
	}

	public void buildTitlePage() {
		System.out.println("printing project title");
		dissertation.setTitle("My Project");
	}

	public void buildTableOfContents() {
		System.out.println("printing project table of contents");
		dissertation.setTableOfContents("project table of contents");
	}

	public void buildSummary() {
		System.out.println("printing project summary");
		dissertation.setAbstractText("project summary");
	}

	public void buildChapters() {
		System.out.println("printing project chapters");
		dissertation.setChapters("project chapters");
	}

	public void buildReferences() {
		System.out.println("printing project bibliography");
		dissertation.setReferences("project bibliography");
	}
	
	public Dissertation getDissertation() {
		return dissertation;
	}

}

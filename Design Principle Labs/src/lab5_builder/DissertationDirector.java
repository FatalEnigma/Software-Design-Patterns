package lab5_builder;

public class DissertationDirector {

	private DissertationBuilder dissertationBuilder = null;
	
	public DissertationDirector (DissertationBuilder dissertationBuilder) {
		super();
		this.dissertationBuilder = dissertationBuilder;
		System.out.println("Director Created");
	}
	
	public Dissertation getDissertation() {
		return this.dissertationBuilder.getDissertation(); }
	
	public void constructDissertation() {
		dissertationBuilder.buildTitlePage();
		dissertationBuilder.buildTableOfContents();
		dissertationBuilder.buildSummary();
		dissertationBuilder.buildChapters();
		dissertationBuilder.buildReferences();
	}
}

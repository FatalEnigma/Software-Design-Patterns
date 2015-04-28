package lab5_builder;

public interface DissertationBuilder {
	
	public void buildTitlePage();
	public void buildTableOfContents();
	public void buildSummary();
	public void buildChapters();
	public void buildReferences();
	public Dissertation getDissertation();
}
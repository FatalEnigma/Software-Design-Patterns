package lab5_builder;

public class Dissertation {
	
	private String title;
	private String tableOfContents;
	private String abstractText;
	private String chapters;
	private String references;
	
	
	public Dissertation(String title, String tableOfContents,
			String abstractText, String chapters, String references) {
		this.title = title;
		this.tableOfContents = tableOfContents;
		this.abstractText = abstractText;
		this.chapters = chapters;
		this.references = references;
	}
	
	public Dissertation() {};


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getTableOfContents() {
		return tableOfContents;
	}


	public void setTableOfContents(String tableOfContents) {
		this.tableOfContents = tableOfContents;
	}


	public String getAbstractText() {
		return abstractText;
	}


	public void setAbstractText(String abstractText) {
		this.abstractText = abstractText;
	}


	public String getChapters() {
		return chapters;
	}


	public void setChapters(String chapters) {
		this.chapters = chapters;
	}


	public String getReferences() {
		return references;
	}


	public void setReferences(String references) {
		this.references = references;
	}

}

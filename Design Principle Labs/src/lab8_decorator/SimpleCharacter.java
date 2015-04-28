package lab8_decorator;

public class SimpleCharacter implements Character {

	public void draw() {
		System.out.println("... Drawing a Simple Character - no decoration");
		// draw functionality
	}

	public String getDescription() {
		return "simple character - no decoration";
		// return the description
	}

}

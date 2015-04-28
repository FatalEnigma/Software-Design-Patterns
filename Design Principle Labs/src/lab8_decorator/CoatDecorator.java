package lab8_decorator;

public class CoatDecorator extends CharacterDecorator {

	public CoatDecorator(Character decoratedCharacter) {
		super(decoratedCharacter);
		drawCoat();
	}
	
	public void draw() {
		drawCoat();
		super.draw();
	}
	
	public String getDescription() {
		return decoratedCharacter.getDescription() + ", decorated with a coat";
	}

	private void drawCoat() {
		System.out.println("...Drawing a coat on character");
	}
	
}

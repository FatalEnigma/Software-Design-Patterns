package lab8_decorator;

public class HatDecorator extends CharacterDecorator {

	public HatDecorator(Character decoratedCharacter) {
		super(decoratedCharacter);
		drawHat();
	}
	
	public void draw() {
		drawHat();
		super.draw();
	}
	
	public String getDescription() {
		return decoratedCharacter.getDescription() + ", decorated with a hat";
	}
	
	private void drawHat() {
		System.out.println("...Drawing a hat on character");
	}

}

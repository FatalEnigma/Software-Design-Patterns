package lab8_decorator;

public class CharacterDecorator implements Character {
	protected Character decoratedCharacter;
	
	public CharacterDecorator(Character decoratedCharacter) {
		this.decoratedCharacter = decoratedCharacter;
	}

	@Override
	public void draw() {
		decoratedCharacter.draw();
	}

	@Override
	public String getDescription() {
		return decoratedCharacter.getDescription();
	}

}

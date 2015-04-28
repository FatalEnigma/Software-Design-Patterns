package lab8_decorator;

public class DecoratedCharacterTest {

    public static void main(String[] args) {
    	// 1. demo of a simple window
    	System.out.println("1. Test Simple Character");
    	// create a simple character and print out its description;
    	Character simpleCharacter = new SimpleCharacter();
    	System.out.println(simpleCharacter.getDescription());
    	
    	// 2. demo of a character decorated with a hat
    	System.out.println("2. Test Character with hat");
    	// create a character decorated with a hat and print out its description;   
    	Character hatCharacter = new HatDecorator(new SimpleCharacter());
    	System.out.println(hatCharacter.getDescription());
        
    	// 3. demo of  a character decorated with a coat
    	System.out.println("3. Test Character with coat");
    	// create a character decorated with a hat and print out its description; 
    	Character coatCharacter = new CoatDecorator(new SimpleCharacter());
    	System.out.println(coatCharacter.getDescription());
        
    	// 4. demo of a character decorated with a hat and coat
        System.out.println("4. Test Character with hat and coat");
     // create a character decorated with a hat AND coat and print out its description; 
        Character coatAndHatCharacter = new CoatDecorator(new HatDecorator(new SimpleCharacter()));
        System.out.println(coatAndHatCharacter.getDescription());
    }
}
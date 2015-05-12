package domain;

public interface Robot {
    public enum Colour {UNPAINTED, BLUE, BLACK, GREEN, RED, SILVER, WHITE, YELLOW};
 
    public Processor getProcessor();
    public Robot.Colour getColour();
    public void paint(Robot.Colour colour);
}

package lab7_composite;

public class Sketch extends SketchedItem{
    public Sketch(String description, int cost) {
        super(description, cost);
    }
 
    // Need Empty implementations for adding and removing..
    
    public void addItem(SketchedItem item) {}
    public void removeItem(SketchedItem item) {}

    public SketchedItem[] getItems() {
    	return new SketchedItem[0];}
    
    public String toString() {
    	return super.toString();
    }
}

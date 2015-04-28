package lab7_composite;

public abstract class SketchedItem {
    private String description;
    private int cost;

 
    public SketchedItem(String description, int cost) {
        this.description = description;
        this.cost = cost;
    }
 
    public String getDescription() {
        return description;
    }
 
    public int getCost() {
        return cost;
    }
    
// For Composite:
// will need abstract methods for adding removing from a list 
// and also returning a list of SketchedItem
    
    public abstract void addItem(SketchedItem item);
    public abstract void removeItem(SketchedItem item);
    public abstract SketchedItem[] getItems();
 
    public String toString() {
        return description + " (cost " + getCost() + ")";
    }
}

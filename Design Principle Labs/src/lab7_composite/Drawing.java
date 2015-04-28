package lab7_composite;

import java.util.ArrayList;
import java.util.List;

public class Drawing extends SketchedItem {

	private List<SketchedItem> items;
	
	public Drawing(String description) {
		super(description, 0);
		items = new ArrayList<SketchedItem>();
	}

	@Override
	public void addItem(SketchedItem item) {
		items.add(item);
	}

	@Override
	public void removeItem(SketchedItem item) {
		items.remove(item);		
	}

	@Override
	public SketchedItem[] getItems() {
		return items.toArray(new SketchedItem[items.size()]);
	}
	
	@Override
	public int getCost() {
		int total = 0;
        for (SketchedItem item : items) {
            total += item.getCost();
        }
        return total;
	}
	
	@Override
	public String toString() {
		String s = super.getDescription() + " consisting of: ";
		for (int i=0; i< items.size(); i++)
			s += items.get(i) + " ";
		return s + "[total cost " + getCost() + "]";
	}
}

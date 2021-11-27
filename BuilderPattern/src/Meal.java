import java.util.*;

public class Meal {
	
	public List<Item> items = new ArrayList<>();

	public void addItem(Item item) {
		items.add(item);
	}
	
	public float getCost() {
		float total = 0.0f;
		for (Item item: items) {
			total+=item.price();
		}
		return total;
	}
	
	public void showItems() {
		for (Item item: items) {
			System.out.print("Item: " + item.name());
			System.out.print(", Packing: " + item.packing().pack());
			System.out.println(", Price: " + item.price());
		}
	}
	
}

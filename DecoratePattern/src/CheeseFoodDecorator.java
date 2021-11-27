
public class CheeseFoodDecorator extends FoodDecorator {
	
	public CheeseFoodDecorator(Food food) {
		super(food);
	}
	
	public void item() {
		food.item();
		setFlavor();
	}
	
	public void setFlavor() {
		System.out.println("Flavor: Cheese");
	}
}

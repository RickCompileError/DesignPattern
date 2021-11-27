
public class ChocolateFoodDecorator extends FoodDecorator {

	public ChocolateFoodDecorator(Food food) {
		super(food);
	}
	
	public void item() {
		food.item();
		setFlavor();
	}
	
	public void setFlavor() {
		System.out.println("Flavor: Chocolate");
	}
	
}

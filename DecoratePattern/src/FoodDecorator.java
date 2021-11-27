
public abstract class FoodDecorator implements Food {

	protected Food food;
	
	public FoodDecorator(Food food) {
		this.food = food;
	}
	
	@Override
	public void item() {
		// TODO Auto-generated method stub
		food.item();
	}

	public abstract void setFlavor();
}

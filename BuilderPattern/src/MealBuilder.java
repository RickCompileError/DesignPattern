
public class MealBuilder {
	
	public Meal prepareSaladMeal(String flavor) {
		Meal meal = new Meal();
		switch(flavor) {
		case "Fruit": meal.addItem(new FruitSalad()); break;
		case "Vegetable": meal.addItem(new VegetableSalad()); break;
		}
		meal.addItem(new GreenTea());
		return meal;
	}
	
	public Meal prepareHamMeal(String flavor) {
		Meal meal = new Meal();
		switch (flavor) {
		case "Beef": meal.addItem(new BeefHamburger()); break;
		case "Pork": meal.addItem(new PorkHamburger()); break;
		}
		meal.addItem(new Coke());
		return meal;
	}
	
}

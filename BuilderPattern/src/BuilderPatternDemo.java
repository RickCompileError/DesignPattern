/*
 * Under Creational Pattern
 * The builder pattern builds the final object step by step.
 */

public class BuilderPatternDemo {
	
	public void demo() {
		MealBuilder mb = new MealBuilder();
		Meal meal = null;
		
		meal = mb.prepareSaladMeal("Fruit");
		System.out.println("Salad meal - flavor fruit");
		meal.showItems();
		System.out.println("Total cost: " + meal.getCost());
		System.out.println("------------------------------");
		
		meal = mb.prepareSaladMeal("Vegetable");
		System.out.println("Salad meal - flavor vegetable");
		meal.showItems();
		System.out.println("Total cost: " + meal.getCost());
		System.out.println("------------------------------");
		
		meal = mb.prepareHamMeal("Beef");
		System.out.println("Hamburger meal - flavor beef");
		meal.showItems();
		System.out.println("Total cost: " + meal.getCost());
		System.out.println("------------------------------");
		
		meal = mb.prepareHamMeal("Pork");
		System.out.println("Hamburger meal - flavor Pork");
		meal.showItems();
		System.out.println("Total cost: " + meal.getCost());
		System.out.println("------------------------------");
	}
	
	public static void main(String[] args) {
		BuilderPatternDemo bpd = new BuilderPatternDemo();
		bpd.demo();
	}
}

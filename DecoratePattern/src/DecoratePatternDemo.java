/*
 * Under Structural Pattern
 * This pattern allows a user to add new functionality to an object without 
 * alternating its structure
 */

public class DecoratePatternDemo {
	
	public void demo() {
		Food food = null;
		
		food = new Doughnut();
		food.item();
		System.out.println("-------------------");
		
		food = new Cake();
		food.item();
		System.out.println("-------------------");
		
		food = new ChocolateFoodDecorator(new Doughnut());
		food.item();
		System.out.println("-------------------");
		
		food = new ChocolateFoodDecorator(new Cake());
		food.item();
		System.out.println("-------------------");
		
		food = new CheeseFoodDecorator(new Doughnut());
		food.item();
		System.out.println("-------------------");
		
		food = new CheeseFoodDecorator(new Cake());
		food.item();
		System.out.println("-------------------");
	}
	
	public static void main(String[] args) {
		DecoratePatternDemo dpd = new DecoratePatternDemo();
		dpd.demo();
	}
	
}

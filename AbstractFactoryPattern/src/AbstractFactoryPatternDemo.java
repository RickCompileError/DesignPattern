/* 
 * Under Creational Pattern
 * Abstract Factory Pattern is similar to Factory Pattern 
 */

public class AbstractFactoryPatternDemo {

	public void demo() {
		DesertFactory df = DesertFactoryProducer.getDesertFactory("Chocolate");
		Desert d = null;
		
		d = df.getDesert("Pancake");
		d.detail();
		System.out.println("-----------------------------------");
		
		d = df.getDesert("IceCream");
		d.detail();
		System.out.println("-----------------------------------");
		
		df = DesertFactoryProducer.getDesertFactory("Strawberry");
		
		d = df.getDesert("Pancake");
		d.detail();
		System.out.println("-----------------------------------");
		
		d = df.getDesert("IceCream");
		d.detail();
		System.out.println("-----------------------------------");
	}
	
	public static void main(String[] args) {
		AbstractFactoryPatternDemo afpd = new AbstractFactoryPatternDemo();
		afpd.demo();
	}
}

/* 
 * Under Creational Pattern
 * Factory Pattern can create object without exposing the creation logic to the client
 * and refer to newly created object using a common interface.
 */

public class FactoryPatternDemo {
	
	public void demo() {
		FurnitureFactory ff = new FurnitureFactory();
		Furniture f = null;
		
		f = ff.getFurniture("Chair");
		f.detail();
		System.out.println("---------------------------------------------");
		
		f = ff.getFurniture("Bed");
		f.detail();
		System.out.println("---------------------------------------------");
		
		f = ff.getFurniture("Table");
		f.detail();
		System.out.println("---------------------------------------------");
		
		f = ff.getFurniture("Apple");
		if (f==null) System.err.println("Furniture doesn't exist");
	}
	
	public static void main(String[] args) {
		FactoryPatternDemo fpDemo = new FactoryPatternDemo();
		fpDemo.demo();
	}
}

/*
 * Under Behavioral Pattern
 * This pattern use a visitor class which changes the executing algorithm of an element class.
 */

public class VisitorPatternDemo {

	public void demo() {
		Visitor visitor = new BuildingVisitor();
		Building build = null;
		
		build = new School("NTCU");
		build.accept(visitor);
		
		build = new Company("TSMC");
		build.accept(visitor);
		
		build = new Church("Sagrada Familia");
		build.accept(visitor);
	}
	
	public static void main(String[] args) {
		VisitorPatternDemo vpd = new VisitorPatternDemo();
		vpd.demo();
	}
	
}

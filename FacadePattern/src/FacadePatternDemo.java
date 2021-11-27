/*
 * Under Structural Pattern
 * This pattern involves a single class which provides simplified methods required by client 
 * and delegates calls to methods of existing system classes
 */

public class FacadePatternDemo {
	
	public void demo() {
		DessertProvider dp = new DessertProvider();
		
		dp.getChocolate();
		System.out.println("-----------------------------------");
		dp.getCake();
		System.out.println("-----------------------------------");
		dp.getPie();
		System.out.println("-----------------------------------");
	}
	
	public static void main(String[] args) {
		FacadePatternDemo fpd = new FacadePatternDemo();
		fpd.demo();
	}
}

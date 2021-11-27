/*
 * Under Structural Pattern
 */

public class BridgePatternDemo {
	
	public void demo() {
		Calculator c = null;
		
		c = new TwoOperation(20,5,new Add());
		c = new TwoOperation(20,5,new Subtract());
		c = new TwoOperation(20,5,new Multiply());
		c = new TwoOperation(20,5,new Divide());
		
		System.out.println("---------------------------");
		
		c = new ThreeOperation(20,5,4,new Add());
		c = new ThreeOperation(20,5,4,new Subtract());
		c = new ThreeOperation(20,5,4,new Multiply());
		c = new ThreeOperation(20,5,4,new Divide());
	}
	
	public static void main(String[] args) {
		BridgePatternDemo bpd = new BridgePatternDemo();
		bpd.demo();
	}
	
}

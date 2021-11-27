/*
 * Under Behavioral Pattern
 * This pattern has a abstract class exposes defined way(s)/template(s) to execute its method.
 * Its subclass can override methods but the invocation needs to be in the same way
 */

public class TemplatePatternDemo {

	public void demo() {
		Compute compute = null;
		
		compute = new AverageCompute();
		compute.execute("1.1 2.2 3.3 4.4 5.5");
		
		compute = new SumCompute();
		compute.execute("1 2 3 4 5");
	}
	
	public static void main(String[] args) {
		TemplatePatternDemo tpd = new TemplatePatternDemo();
		tpd.demo();
	}
	
}

/*
 * Under Behavioral Pattern
 * This pattern can let a class behavior or algorithm be changed at run time 
 */

public class StrategyPatternDemo {

	public void demo() {
		Strategy strategy = new Strategy();
		System.out.println("2 + 3 = " + strategy.executeStrategy(2,3));
		
		strategy.changeStrategy(new SubstractOperation());
		System.out.println("3 - 2 = " + strategy.executeStrategy(3, 2));
		
		strategy.changeStrategy(new MultiplyOperation());
		System.out.println("4 * 5 = " + strategy.executeStrategy(4, 5));
	}
	
	public static void main(String[] args) {
		StrategyPatternDemo spd = new StrategyPatternDemo();
		spd.demo();
	}
	
}

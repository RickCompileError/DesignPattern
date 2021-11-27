/*
 * Under Structural Pattern
 * Composite pattern composes objects in term of a tree structure to represent part as well as whole hierarchy
 * This pattern creates a class that contains group of its own objects.
 * This class provides ways to modify its group of same objects.
 */

import java.util.*;

public class CompositePatternDemo {
	
	public void demo() {
		Employee CEO = new Employee("Boss", 364, 1000000000);
		
		Employee StrategyManager = new Employee("Rick", 360, 10000000);
		Employee DiplomaticManager = new Employee("Tom", 360, 10000000);
		Employee PlanningManager = new Employee("Sam", 360, 10000000);
		
		Employee clerk1 = new Employee("Kevin", 0, 100);
		Employee clerk2 = new Employee("Murloc", 0, 100);
		Employee clerk3 = new Employee("Steven", 0, 100);
		
		CEO.add(StrategyManager);
		CEO.add(DiplomaticManager);
		CEO.add(PlanningManager);
		
		StrategyManager.add(clerk1);
		StrategyManager.add(clerk2);
		
		DiplomaticManager.add(clerk1);
		DiplomaticManager.add(clerk3);
		
		PlanningManager.add(clerk2);
		PlanningManager.add(clerk3);
		
		List<Employee> employee = null;
		
		employee = CEO.getSubordinates();
		System.out.println("CEO subordinates: ");
		for (Employee e: employee) {
			System.out.println("\t" + e.toString());
		}
		System.out.println("--------------------------------------------------------");

		employee = StrategyManager.getSubordinates();
		System.out.println("Strategy manager subordinates: ");
		for (Employee e: employee) {
			System.out.println("\t" + e.toString());
		}
		System.out.println("--------------------------------------------------------");

		employee = DiplomaticManager.getSubordinates();
		System.out.println("Diplomatic manager subordinates: ");
		for (Employee e: employee) {
			System.out.println("\t" + e.toString());
		}
		System.out.println("--------------------------------------------------------");

		employee = PlanningManager.getSubordinates();
		System.out.println("Planning manager subordinates: ");
		for (Employee e: employee) {
			System.out.println("\t" + e.toString());
		}
		System.out.println("--------------------------------------------------------");
	}
	
	public static void main(String[] args) {
		CompositePatternDemo cpd = new CompositePatternDemo();
		cpd.demo();
	}
	
}

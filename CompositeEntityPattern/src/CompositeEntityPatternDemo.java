/*
 * Composite Entity pattern is used in EJB persistence mechanism. 
 * A Composite entity is an EJB entity bean which represents a graph of objects. 
 * When a composite entity is updated, internally dependent objects beans get updated automatically 
 * as being managed by EJB entity bean. Following are the participants in Composite Entity Bean.
 */

public class CompositeEntityPatternDemo {

	public void demo() {
		Contest contest = new Contest();
		
		contest.setContestResult("Rick", "Kevin");
		contest.printContestResult();
		
		contest.setContestResult("Boss", "Sam");
		contest.printContestResult();
	}
	
	public static void main(String[] args) {
		CompositeEntityPatternDemo cepd = new CompositeEntityPatternDemo();
		cepd.demo();
	}
	
}

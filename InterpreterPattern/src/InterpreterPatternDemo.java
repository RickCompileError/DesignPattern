/*
 * Under Behavioral Pattern
 * This pattern provides a way to evaluate language grammar and expression and 
 * involves implementing an expression interface which tells to interpret a particular context
 */

public class InterpreterPatternDemo {
	
	public void demo() {
		Expression studentExpression = getStudentExpression();
		Expression teacherExpression = getTeacherExpression();
		
		System.out.println("Do these conditios meet the student features? " + studentExpression.interpret("Bag Book Uniform"));
		System.out.println("Do these conditios meet the teacher features? " + teacherExpression.interpret("Mic Bampoo HighHeels"));
	}
	
	private Expression getStudentExpression() {
		Expression necessity1 = new TerminalExpression("Bag");
		Expression necessity2 = new TerminalExpression("Book");
		Expression necessity3 = new TerminalExpression("PencilBox");
		Expression necessities = new OrExpression(necessity1, necessity2, necessity3);
		
		Expression appearance1 = new TerminalExpression("Uniform");
		Expression appearance2 = new TerminalExpression("Dress");
		Expression appearance3 = new TerminalExpression("Belt");
		Expression appearances = new OrExpression(appearance1, appearance2, appearance3);
		
		return new AndExpression(necessities,appearances);
	}
	
	private Expression getTeacherExpression() {
		Expression necessity1 = new TerminalExpression("Mic");
		Expression necessity2 = new TerminalExpression("Bampoo");
		Expression necessity3 = new TerminalExpression("TestPaper");
		Expression necessities = new OrExpression(necessity1, necessity2, necessity3);
		
		Expression appearance1 = new TerminalExpression("HighHeels");
		Expression appearance2 = new TerminalExpression("Tie");
		Expression appearance3 = new TerminalExpression("Suit");
		Expression appearances = new OrExpression(appearance1, appearance2, appearance3);
		
		return new AndExpression(necessities, appearances);
	}
	
	public static void main(String[] args) {
		InterpreterPatternDemo ipd = new InterpreterPatternDemo();
		ipd.demo();
	}
	
}

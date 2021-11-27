
public class OrExpression implements Expression {

	private Expression[] expressions;
	
	public OrExpression(Expression ...expressions) {
		this.expressions = expressions;
	}
	
	@Override
	public boolean interpret(String context) {
		// TODO Auto-generated method stub
		boolean result = false;
		for (Expression exp: expressions) {
			result = result || exp.interpret(context);
		}
		return result;
	}

}

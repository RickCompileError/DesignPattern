
public class AndExpression implements Expression {

	private Expression[] expressions;
	
	public AndExpression(Expression ...expressions) {
		this.expressions = expressions;
	}
	
	@Override
	public boolean interpret(String context) {
		// TODO Auto-generated method stub
		boolean result = true;
		for (Expression exp: expressions) {
			result = result && exp.interpret(context);
		}
		return result;
	}

}

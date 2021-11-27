
public abstract class Calculator {
	
	protected Operator operator = null;
	
	public Calculator(Operator operator) {
		this.operator = operator;
	}
	
	public abstract void compute();
	
}

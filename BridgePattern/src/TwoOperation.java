
public class TwoOperation extends Calculator {

	int a,b;
	
	public TwoOperation(int a, int b, Operator operator) {
		super(operator);
		this.a = a;
		this.b = b;
		compute();
	}
	
	@Override
	public void compute() {
		// TODO Auto-generated method stub
		operator.compute(a,b);
	}

}

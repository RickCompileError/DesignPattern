
public class ThreeOperation extends Calculator {

	int a,b,c;
	
	public ThreeOperation(int a, int b, int c, Operator operator) {
		super(operator);
		this.a = a;
		this.b = b;
		this.c = c;
		compute();
	}
	
	@Override
	public void compute() {
		// TODO Auto-generated method stub
		operator.compute(a,b,c);
	}

}


public class Multiply implements Operator {

	@Override
	public void compute(int... is) {
		// TODO Auto-generated method stub
		int result = is[0];
		System.out.print(is[0]);
		for (int i=1;i<is.length;i++) {
			result*=is[i];
			System.out.print(" * " + is[i]);
		}
		System.out.println(" = " + result);
	}

}

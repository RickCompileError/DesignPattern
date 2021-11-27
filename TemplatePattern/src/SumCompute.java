
public class SumCompute extends Compute {

	@Override
	public float compute(float[] data) {
		// TODO Auto-generated method stub
		float result = 0;
		for (int i=0;i<data.length;i++) result+=data[i];
		return result;
	}

	@Override
	public void display(float answer) {
		// TODO Auto-generated method stub
		System.out.println("Sum result: " + answer);
	}

}

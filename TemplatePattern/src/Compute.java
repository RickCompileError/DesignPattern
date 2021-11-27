
public abstract class Compute {
	
	public float[] transform(String input) {
		String[] s = input.trim().split(" ");
		float[] f = new float[s.length];
		try {
			for (int i=0;i<s.length;i++) {
				f[i] = Float.valueOf(s[i]);
			}
		}
		catch (NumberFormatException nfe) {
			return null;
		}
		return f;
	}
	
	public abstract float compute(float[] data);
	public abstract void display(float answer);
	
	public final void execute(String input) {
		float[] data = transform(input);
		
		if (data != null) {
			float result = compute(data);
			display(result);
		}
		else {
			System.out.println("Input Error");
		}
	}
	
}

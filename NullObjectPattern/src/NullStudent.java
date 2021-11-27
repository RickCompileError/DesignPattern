
public class NullStudent implements Student {

	@Override
	public boolean isStudent() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Doesn't found in Database";
	}

}

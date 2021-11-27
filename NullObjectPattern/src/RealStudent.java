
public class RealStudent implements Student {

	private String name;
	
	public RealStudent(String name) {
		this.name = name;
	}
	
	@Override
	public boolean isStudent() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Student: " + name;
	}

}


public class DifficultAnswer extends DifficultyAnswer {

	public DifficultAnswer(int level) {
		this.level = level;
	}
	
	@Override
	protected void getAnswer(String name) {
		// TODO Auto-generated method stub
		System.out.println("Name " + name + " can get difficult answer");
	}

}

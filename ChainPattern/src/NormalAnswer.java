
public class NormalAnswer extends DifficultyAnswer {

	public NormalAnswer(int level) {
		this.level = level;
	}
	
	@Override
	protected void getAnswer(String name) {
		// TODO Auto-generated method stub
		System.out.println("Name " + name + " can get normal answer");
	}

}

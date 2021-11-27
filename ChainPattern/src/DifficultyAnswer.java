
public abstract class DifficultyAnswer {

	public static int EASY = 1;
	public static int NORMAL = 2;
	public static int DIFFICULT = 3;
	
	protected int level;
	
	protected DifficultyAnswer nextDifficulty = null;
	
	public void setNextDifficulty(DifficultyAnswer nextDifficulty) {
		this.nextDifficulty = nextDifficulty;
	}
	
	public void requestAnswer(String name, int level) {
		if (this.level <= level) getAnswer(name);
		if (nextDifficulty != null) nextDifficulty.requestAnswer(name, level);
	}
	
	protected abstract void getAnswer(String name);
}

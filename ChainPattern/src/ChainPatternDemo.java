/*
 * Under Behavioral Pattern
 * In this pattern, normally each receiver contains reference to another receiver.
 * If one object can't not handle the request then it passes to the next receiver and so on.
 */

public class ChainPatternDemo {
	
	private DifficultyAnswer getDifficultyAnswer() {
		DifficultyAnswer easy = new EasyAnswer(1);
		DifficultyAnswer normal = new NormalAnswer(2);
		DifficultyAnswer difficult = new DifficultAnswer(3);
		
		difficult.setNextDifficulty(normal);
		normal.setNextDifficulty(easy);
		
		return difficult;
	}
	
	public void demo() {
		DifficultyAnswer da = getDifficultyAnswer();
		
		da.requestAnswer("Rick", 3);
		System.out.println("-----------------------------------");
		da.requestAnswer("Boss", 2);
		System.out.println("-----------------------------------");
		da.requestAnswer("Kevin", 1);
		System.out.println("-----------------------------------");
	}
	
	public static void main(String[] args) {
		ChainPatternDemo cpd = new ChainPatternDemo();
		cpd.demo();
	}
	
}

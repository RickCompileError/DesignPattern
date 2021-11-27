
public class CoarseGrainedObject {

	private Result dependentWinner;
	private Result dependentLoser;
	
	public CoarseGrainedObject() {
		dependentWinner = new Winner();
		dependentLoser = new Loser();
	}
	
	public String[] getResult() {
		return new String[] {dependentWinner.getContestant(), dependentLoser.getContestant()};
	}
	
	public void setResult(String name1, String name2) {
		dependentWinner.setContestant(name1);
		dependentLoser.setContestant(name2);
	}
	
}

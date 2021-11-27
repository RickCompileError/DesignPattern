
public class Contest {

	private CompositeEntity compositeEntity;
	
	public Contest() {
		compositeEntity = new CompositeEntity();
	}
	
	public void printContestResult() {
		String[] result = compositeEntity.getResult();
		
		for (int i=0;i<result.length;i++) {
			System.out.print(result[i] + " ");
		}
		System.out.println();
	}
	
	public void setContestResult(String contestant1, String contestant2) {
		compositeEntity.setResult(contestant1, contestant2);
	}
	
}

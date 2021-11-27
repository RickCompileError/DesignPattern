
public class CompositeEntity {

	private CoarseGrainedObject cgo;
	
	public CompositeEntity() {
		cgo = new CoarseGrainedObject();
	}
	
	public String[] getResult() {
		return cgo.getResult();
	}
	
	public void setResult(String name1, String name2) {
		cgo.setResult(name1, name2);
	}
	
}

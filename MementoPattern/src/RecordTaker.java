import java.util.*;

public class RecordTaker {

	private List<Memento> mementos = new ArrayList<>();
	
	public void add(Memento m) {
		mementos.add(m);
	}
	
	public Memento get(int index) {
		return index<mementos.size()?mementos.get(index):null;
	}
	
}

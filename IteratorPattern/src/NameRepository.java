import java.util.*;

public class NameRepository implements Container {

	private List<String> names = new ArrayList<>();
	
	public void add(String name) {
		names.add(name);
	}
	
	public void clear(String name) {
		names.clear();
	}
	
	@Override
	public Iterator getIterator() {
		// TODO Auto-generated method stub
		return new NameIterator();
	}

	private class NameIterator implements Iterator{
		
		private int index = 0;
		
		@Override
		public boolean hasNext() {
			return index < names.size();
		}
		
		@Override
		public Object next() {
			if (this.hasNext()) {
				return names.get(index++);
			}
			return null;
		}
	}
	
}

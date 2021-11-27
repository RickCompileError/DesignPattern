/*
 * Under Behavioral Pattern
 * This pattern is very commonly used in JAVA and .NET.
 * It is used to get a way to access the elements of a collection object in sequential manner 
 * without any need to know its underlying representation.
 */

public class IteratorPatternDemo {
	
	public void demo() {
		NameRepository namesRepository = getNameRepository();
		for (Iterator iterator = namesRepository.getIterator();iterator.hasNext();) {
			System.out.println("Name: " + (String)iterator.next());
		}
	}
	
	private NameRepository getNameRepository() {
		NameRepository produceRepository = new NameRepository();
		
		String[] names = {"Rick", "Boss", "Tom", "Sam", "Kevin", "Murloc"};
		for (String name: names) {
			produceRepository.add(name);
		}
		
		return produceRepository;
	}
	
	public static void main(String[] args) {
		IteratorPatternDemo ipd = new IteratorPatternDemo();
		ipd.demo();
	}
	
}

import java.util.Hashtable;

public class PersonCache {

	private static Hashtable<Integer, Person> personMap = new Hashtable<>();
	
	public static Person getPerson(Integer id) {
		Person cachedPerson = personMap.get(id);
		return (Person) cachedPerson.clone();
	}
	
	public static void loadCache() {
		Rick rick = new Rick();
		rick.setId(0);
		personMap.put(rick.getId(), rick);
		
		John john = new John();
		john.setId(1);
		personMap.put(john.getId(), john);
		
		Tom tom = new Tom();
		tom.setId(2);
		personMap.put(tom.getId(), tom);
		
		Sam sam = new Sam();
		sam.setId(3);
		personMap.put(sam.getId(), sam);
	}
	
}

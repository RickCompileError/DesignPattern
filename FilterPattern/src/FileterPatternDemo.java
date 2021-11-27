/*
 * Also called Criteria Pattern
 * Under Structural Pattern
 * This pattern enables developers to filter a set of objects using different criteria and 
 * chaining them in a decoupled way through logical operations
 */
import java.util.*;

public class FileterPatternDemo {
	
	public void demo() {
		List<Person> persons = new ArrayList<>();
		persons.add(new Person(180,90,"Male"));
		persons.add(new Person(180,90,"Female"));
		persons.add(new Person(180,80,"Male"));
		persons.add(new Person(180,80,"Female"));
		persons.add(new Person(160,90,"Male"));
		persons.add(new Person(160,90,"Female"));
		persons.add(new Person(160,80,"Male"));
		persons.add(new Person(160,80,"Female"));
		
		Criteria criteria = null;
		List<Person> meetPersons = null;
		
		criteria = new TallCriteria();
		meetPersons = criteria.meetCriteria(persons);
		System.out.println("Tall Persons: ");
		for (Person p: meetPersons) System.out.println(p);
		System.out.println("------------------------------------------------");
		
		criteria = new LowCriteria();
		meetPersons = criteria.meetCriteria(persons);
		System.out.println("Low Persons: ");
		for (Person p: meetPersons) System.out.println(p);
		System.out.println("------------------------------------------------");
		
		criteria = new FatCriteria();
		meetPersons = criteria.meetCriteria(persons);
		System.out.println("Fat Persons: ");
		for (Person p: meetPersons) System.out.println(p);
		System.out.println("------------------------------------------------");
		
		criteria = new ThinCriteria();
		meetPersons = criteria.meetCriteria(persons);
		System.out.println("Thin Persons: ");
		for (Person p: meetPersons) System.out.println(p);
		System.out.println("------------------------------------------------");
		
		criteria = new MaleCriteria();
		meetPersons = criteria.meetCriteria(persons);
		System.out.println("Male Persons: ");
		for (Person p: meetPersons) System.out.println(p);
		System.out.println("------------------------------------------------");
		
		criteria = new FemaleCriteria();
		meetPersons = criteria.meetCriteria(persons);
		System.out.println("Female Persons: ");
		for (Person p: meetPersons) System.out.println(p);
		System.out.println("------------------------------------------------");
		
		criteria = new AndCriteria(new TallCriteria(), new ThinCriteria(), new MaleCriteria());
		meetPersons = criteria.meetCriteria(persons);
		System.out.println("And Persons: ");
		for (Person p: meetPersons) System.out.println(p);
		System.out.println("------------------------------------------------");
		
		criteria = new OrCriteria(new TallCriteria(), new ThinCriteria(), new MaleCriteria());
		meetPersons = criteria.meetCriteria(persons);
		System.out.println("Or Persons: ");
		for (Person p: meetPersons) System.out.println(p);
		System.out.println("------------------------------------------------");
		
	}
	
	public static void main(String[] args) {
		FileterPatternDemo fpd = new FileterPatternDemo();
		fpd.demo();
	}
	
}

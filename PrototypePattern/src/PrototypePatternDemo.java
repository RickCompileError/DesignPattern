/*
 * Under Creational Pattern
 * This pattern involves implementing a prototype interface which
 * tells to create a clone of the current object
 * 
 */

public class PrototypePatternDemo {
	
	public void demo() {
		PersonCache.loadCache();
		Person person = null;

		person = (Person) PersonCache.getPerson(0);
		System.out.print("Name: " + person.getName());
		System.out.println(", Nickname: " + person.getNickname());
		System.out.println("-----------------------------------");
		
		person = (Person) PersonCache.getPerson(1);
		System.out.print("Name: " + person.getName());
		System.out.println(", Nickname: " + person.getNickname());
		System.out.println("-----------------------------------");
		
		person = (Person) PersonCache.getPerson(2);
		System.out.print("Name: " + person.getName());
		System.out.println(", Nickname: " + person.getNickname());
		System.out.println("-----------------------------------");
		
		person = (Person) PersonCache.getPerson(3);
		System.out.print("Name: " + person.getName());
		System.out.println(", Nickname: " + person.getNickname());
		System.out.println("-----------------------------------");
	}
	
	public static void main(String[] args) {
		PrototypePatternDemo ppd = new PrototypePatternDemo();
		ppd.demo();
	}
	
}

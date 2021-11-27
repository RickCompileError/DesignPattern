/*
 * Under Behavioral Pattern
 * A null object replaces check of NULL object instance.
 * Instead of putting if check for a null value.
 * Can be used to provide default behavior
 * The Example uses Null Object Pattern and Factory Pattern for demonstrate
 */

public class NullObjectPatternDemo {

	public void demo() {
		StudentFactory sf = new StudentFactory();
		Student student = null;
		
		student = sf.getStudent("Rick");
		System.out.println(student.getName());

		student = sf.getStudent("Boss");
		System.out.println(student.getName());

		student = sf.getStudent("Sam");
		System.out.println(student.getName());

		student = sf.getStudent("Tom");
		System.out.println(student.getName());

		student = sf.getStudent("Kevin");
		System.out.println(student.getName());

		student = sf.getStudent("Murloc");
		System.out.println(student.getName());
	}
	
	public static void main(String[] args) {
		NullObjectPatternDemo nopd = new NullObjectPatternDemo();
		nopd.demo();
	}
	
}

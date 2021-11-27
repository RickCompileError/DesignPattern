/*
 * Under Behavioral Pattern
 * This pattern is used when there is one-to-many relationship between object such as 
 * if one object is modified, its dependent objects are to be notified automatically
 */

public class ObserverPatternDemo {

	public void demo() {
		Teacher teacher = new Teacher();

		for (int i=0;i<5;i++) new Student(teacher);
		
		teacher.setHomework("Math homework.");
		System.out.println("-----------------------------");
		teacher.setHomework("Chinese homework.");
		System.out.println("-----------------------------");
	}
	
	public static void main(String[] args) {
		ObserverPatternDemo opd = new ObserverPatternDemo();
		opd.demo();
	}
	
}

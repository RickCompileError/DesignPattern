
public class StudentFactory {

	private static String[] names = {"Rick", "Boss", "Tom", "Sam"};
	
	public Student getStudent(String name) {
		for (String n: names) {
			if (n.equals(name)) return new RealStudent(name);
		}
		return new NullStudent();
	}
	
}

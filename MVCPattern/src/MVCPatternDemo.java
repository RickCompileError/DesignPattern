/*
 * Stands for Model-View-Control Pattern.
 * This pattern is used to application's concerns
 */

import java.util.*;

public class MVCPatternDemo {

	public void demo() {
		List<Student> students = getStudentInfoFromDatabase();
		StudentView studentView = new StudentView();
		StudentController studentController = new StudentController(students, studentView);
		
		studentController.showStudents();
	}
	
	private List<Student> getStudentInfoFromDatabase() {
		List<Student> students = new ArrayList<>();
		String[] studentName = {"Rick", "Boss", "Tom", "Sam", "Kevin", "Murloc"};
		
		for (int i=0;i<studentName.length;i++) {
			students.add(new Student(studentName[i], i));
		}
		return students;
	}
	
	public static void main(String[] args) {
		MVCPatternDemo mvcpd = new MVCPatternDemo();
		mvcpd.demo();
	}
	
}

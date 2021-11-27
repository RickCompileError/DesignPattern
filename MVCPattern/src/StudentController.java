import java.util.*;

public class StudentController {

	private List<Student> students;
	private StudentView studentView;
	
	public StudentController(List<Student> students, StudentView studentView) {
		this.students = students;
		this.studentView = studentView;
	}
	
	public void setStudentName(int index, String name) {
		students.get(index).setName(name);
	}
	
	public void setStudentNo(int index, int no) {
		students.get(index).setNo(no);
	}
	
	public void showStudents() {
		students.forEach((s) -> studentView.show(s.getName(), s.getNo()));
	}
	
}

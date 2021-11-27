import java.util.*;

public class StudentBusinessObject {

	List<StudentValueObject> students;
	
	public StudentBusinessObject() {
		students = new ArrayList<>();
		String[] studentName = {"Rick", "Boss", "Sam", "Tom"};
		for (int i=0;i<studentName.length;i++) {
			students.add(new StudentValueObject(studentName[i], i));
		}
	}
	
	public List<StudentValueObject> getAllStudent() {
		return students;
	}
	
	public StudentValueObject getStudent(int no) {
		for (StudentValueObject s: students) {
			if (s.getNo() == no) return s;
		}
		return null;
	}
	
	public void updateStudent(StudentValueObject student) {
		StudentValueObject stu = getStudent(student.getNo());
		if (stu == null) {
			System.out.println("No student found");
		}
		else {
			stu.setName(student.getName());
			System.out.println("Update " + stu);
		}
	}
	
	public void deleteStudent(StudentValueObject student) {
		StudentValueObject stu = getStudent(student.getNo());
		if (stu == null) {
			System.out.println("No student found");
		}
		else {
			System.out.println("Delete " + stu);
			students.remove(stu);
		}
	}
	
}

import java.util.*;

public class StudentDaoImp implements StudentDao {

	private List<Student> students;
	private String[] studentName = {"Rick", "Boss", "Tom", "Sam"};
	
	public StudentDaoImp() {
		students = new ArrayList<>();
		
		for (int i=0;i<studentName.length;i++) {
			students.add(new Student(studentName[i], i));
		}
	}
	
	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return students;
	}

	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		Student stu = getStudent(student.getNo());
		
		if (stu != null) {
			System.out.println("Renew Student: " + stu.getName() + " No: " + stu.getNo());
			stu.setName(student.getName());
			stu.setNo(student.getNo());
			System.out.println("Now Sutdent: " + stu.getName() + " No: " + stu.getNo());
		}
	}

	@Override
	public void deleteStudent(Student student) {
		// TODO Auto-generated method stub
		Student stu = getStudent(student.getNo());
		
		if (stu != null) {
			System.out.println("Delete Student: " + stu.getName() + " No: " + stu.getNo());
			students.remove(stu);
		}
	}

	@Override
	public Student getStudent(int no) {
		// TODO Auto-generated method stub
		Student stu = null;
		for (Student s: students) {
			if (s.getNo() == no) {
				stu = s;
				break;
			}
		}
		
		if (stu == null) {
			System.out.println("Student not found");
		}
		return stu;
	}

}

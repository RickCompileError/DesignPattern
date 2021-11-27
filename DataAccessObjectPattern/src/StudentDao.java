import java.util.*;

public interface StudentDao {

	public List<Student> getAllStudent();
	public void updateStudent(Student student);
	public void deleteStudent(Student student);
	public Student getStudent(int no);
	
}

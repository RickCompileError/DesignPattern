
public class Student implements Observer {

	private Teacher teacher;
	
	public Student(Teacher teacher) {
		this.teacher = teacher;
		this.teacher.attach(this);
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println(teacher.getHomework());
	}

}

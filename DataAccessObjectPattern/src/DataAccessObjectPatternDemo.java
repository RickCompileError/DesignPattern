/*
 * This pattern or DAO pattern is used to separate low level data accessing API or operations from 
 * high level business services.
 */

public class DataAccessObjectPatternDemo {

	public void demo() {
		StudentDao sd = new StudentDaoImp();
		
		for (Student s: sd.getAllStudent()) {
			System.out.println(s.getName() + " " + s.getNo());
		}
		System.out.println("------------------------------------");
		
		sd.updateStudent(new Student("Kevin", 1));
		System.out.println("------------------------------------");
		
		sd.deleteStudent(new Student("Tom", 2));
		System.out.println("------------------------------------");
	}
	
	public static void main(String[] args) {
		DataAccessObjectPatternDemo daopd = new DataAccessObjectPatternDemo();
		daopd.demo();
	}
	
}

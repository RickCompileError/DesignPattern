/*
 * This pattern is used when we want to pass data with multiple attributes in one shot from client to server.
 * Transfer object is also known as Value Object.
 */

public class TransferObjectPatternDemo {

	public void demo() {
		StudentBusinessObject sbo = new StudentBusinessObject();
		
		for (StudentValueObject student: sbo.getAllStudent()) {
			System.out.println(student);
		}
		System.out.println("--------------------------------------");
		
		StudentValueObject svo = sbo.getStudent(0);
		System.out.println(svo);
		System.out.println("--------------------------------------");
		
		svo = new StudentValueObject("Kevin", 1);
		sbo.updateStudent(svo);
		System.out.println("--------------------------------------");
		
		svo = new StudentValueObject("Tom", 3);
		sbo.deleteStudent(svo);
		System.out.println("--------------------------------------");
		
		for (StudentValueObject student: sbo.getAllStudent()) {
			System.out.println(student);
		}
		System.out.println("--------------------------------------");
		
	}
	
	public static void main(String[] args) {
		TransferObjectPatternDemo topd = new TransferObjectPatternDemo();
		topd.demo();
	}
}

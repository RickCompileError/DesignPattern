
public class StudentValueObject {

	private String name;
	private int no;
	
	public StudentValueObject(String name, int no) {
		this.name = name;
		this.no = no;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getNo() {
		return no;
	}
	
	public void setNo(int no) {
		this.no = no;
	}
	
	public String toString() {
		return "Student [Name: " + name + ", No: " + no + "]";
	}
	
}

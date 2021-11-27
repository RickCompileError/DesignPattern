import java.util.*;

public class Employee {
	
	private String name;
	private int vacation;
	private int salary;
	private List<Employee> subordinates = new ArrayList<Employee>();
	
	public Employee(String name, int vacation, int salary) {
		this.name = name;
		this.vacation = vacation;
		this.salary = salary;
	}
	
	public void add(Employee sub) {
		subordinates.add(sub);
	}
	
	public String getName() {
		return name;
	}
	
	public int getVacation() {
		return vacation;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public List<Employee> getSubordinates() {
		return subordinates;
	}
	
	public String toString() {
		return "[Name: " + name + ", Vacation: " + vacation + ", Salary: " + salary +"]";
	}
}

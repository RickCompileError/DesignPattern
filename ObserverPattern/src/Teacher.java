import java.util.*;

public class Teacher implements Subject {

	private List<Observer> students = new ArrayList<>();
	private String homework;
	
	@Override
	public void attach(Observer o) {
		// TODO Auto-generated method stub
		students.add(o);
	}

	@Override
	public void detach(Observer o) {
		// TODO Auto-generated method stub
		students.remove(o);
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		students.forEach(Observer::update);
	}

	public String getHomework() {
		return homework;
	}
	
	public void setHomework(String homework) {
		this.homework = homework;
		notifyObservers();
	}
}


public class Person {
	
	public int height;
	public int weight;
	public String gender;
	
	public Person(int height, int weight, String gender) {
		this.height = height;
		this.weight = weight;
		this.gender = gender;
	}
	
	public int getHeight() {
		return height;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public String getGender() {
		return gender;
	}
	
	public String toString() {
		String s = "Person [Height: " + getHeight() + ", Weight: " + getWeight() + 
				", Gender: " + getGender() + "]";
		return s;
	}
	
}
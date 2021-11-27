
public class Character {

	private String name;
	private int blood;
	private int power;
	private int magic;
	
	public Character(String name) {
		this.name = name;
		blood = 100;
		power = 20;
		magic = 10;
	}
	
	public void levelUp() {
		blood += 100;
		power += 20;
		magic += 5;
		System.out.println(name + " level up");
	}
	
	public Memento saveRecord() {
		System.out.println("Success save the record");
		return new Memento(blood, power, magic);
	}
	
	public void readRecord(Memento memento) {
		if (memento == null) {
			System.out.println("The record doesn't exist");
			return;
		}
		
		blood = memento.getBlood();
		power = memento.getPower();
		magic = memento.getMagic();
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		return name + " [blood: " + blood + ", power: " + power + ", magic: " + magic + "]";
	}
	
}


public class Memento {

	private int blood;
	private int power;
	private int magic;
	
	public Memento(int blood, int power, int magic) {
		this.blood = blood;
		this.power = power;
		this.magic = magic;
	}
	
	public int getBlood() {
		return blood;
	}
	
	public int getPower() {
		return power;
	}
	
	public int getMagic() {
		return magic;
	}
	
}

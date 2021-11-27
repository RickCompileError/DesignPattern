
public abstract class Salad implements Item {

	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return new Box();
	}
	
	public abstract float price();

}


public abstract class Drink implements Item {

	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return new Bottle();
	}

	public abstract float price();
	
}

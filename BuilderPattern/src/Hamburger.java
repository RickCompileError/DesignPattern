
public abstract class Hamburger implements Item {

	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return new Wrapper();
	}
	
	public abstract float price();

}

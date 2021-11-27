
public abstract class Building {
	
	protected String name;
	
	public abstract String getName();
	public abstract void accept(Visitor visitor);
	
}

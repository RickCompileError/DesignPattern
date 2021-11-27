
public class Stock {

	private String name;
	
	public Stock(String name) {
		this.name = name;
	}
	
	public void buy(int quantity) {
		System.out.println("Name " + name + " buy " + quantity + " stocks");
	}
	
	public void sell(int quantity) {
		System.out.println("Name " + name + " sell " + quantity + " stocks");
	}
}


public class DessertProvider {

	private Dessert chocolate;
	private Dessert cake;
	private Dessert pie;
	
	public DessertProvider() {
		makeDessert();
	}
	
	public void makeDessert() {
		chocolate = new Chocolate();
		cake = new Cake();
		pie = new Pie();
	}
	
	public void getChocolate() {
		chocolate.detail();
	}
	
	public void getCake() {
		cake.detail();
	}
	
	public void getPie() {
		pie.detail();
	}
	
}

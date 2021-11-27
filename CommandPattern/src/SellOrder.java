
public class SellOrder implements Order {

	private Stock stock;
	private int quantity;
	
	public SellOrder(Stock stock, int quantity) {
		this.stock = stock;
		this.quantity = quantity;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		stock.sell(quantity);
	}

}

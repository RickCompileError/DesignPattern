import java.util.*;

public class Broker {
	
	private List<Order> orders = new ArrayList<>();
	
	public void takeOrder(Order order) {
		orders.add(order);
	}
	
	public void placeOrder() {
		for (Order o: orders) {
			o.execute();
		}
		orders.clear();
	}
}

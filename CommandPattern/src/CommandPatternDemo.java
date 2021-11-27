/*
 * Under Behavioral Pattern
 * A request is wrapped under an object as command and passed to invoker object.
 * Invoker object looks for the appropriate object which can handle this command and 
 * passes the command to the corresponding object which executes the command.
 */

import java.util.*;

public class CommandPatternDemo {
	
	private HashMap<Integer,Stock> clients = new HashMap<>();
	
	private void setClient(){
		String[] clientsName = {"Rick", "Boss", "Sam"};
		for (int i=0;i<clientsName.length;i++) {
			clients.put(i, new Stock(clientsName[i]));
		}
	}
	
	public void demo() {
		setClient();
		
		Broker broker = new Broker();
		
		System.out.println("-----Start take orders-----");
		for (int i=0;i<10;i++) {
			Order order = getOrder();
			System.out.println("Get " + i + " order");
			broker.takeOrder(order);
		}
		System.out.println("-----Start place orders-----");
		broker.placeOrder();
	}
	
	private Order getOrder() {
		int quantity = getQuantity();
		Stock client = getStock();
		int randomOrder = (int)(Math.random()*2);
		return randomOrder==0?new BuyOrder(client,quantity):new SellOrder(client,quantity);
	}
	
	private int getQuantity() {
		return (int)(Math.random()*10+1);
	}
	
	private Stock getStock() {
		return clients.get((int)(Math.random()*3));
	}
	
	public static void main(String[] args) {
		CommandPatternDemo cpd = new CommandPatternDemo();
		cpd.demo();
	}
}

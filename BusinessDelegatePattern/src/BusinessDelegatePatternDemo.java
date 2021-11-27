/*
 * This pattern is used to decouple presentation tier and business tier.
 * It reduces the coupling between presentation-tier clients and the system¡¦s Business services.
 */

public class BusinessDelegatePatternDemo {

	public void demo() {
		BusinessDelegate businessDelegate = new BusinessDelegate();
		Client client = new Client(businessDelegate);
		
		businessDelegate.setBusinessServer("Taiwan");
		client.doTask();
		
		businessDelegate.setBusinessServer("United States");
		client.doTask();
		
		businessDelegate.setBusinessServer("Korea");
		client.doTask();
	}
	
	public static void main(String[] args) {
		BusinessDelegatePatternDemo bdpd = new BusinessDelegatePatternDemo();
		bdpd.demo();
	}
	
}


public class Client {

	private BusinessDelegate businessDelegate = null;
	
	public Client(BusinessDelegate businessDelegate) {
		this.businessDelegate = businessDelegate;
	}
	
	public void doTask() {
		businessDelegate.doTask();
	}
	
}

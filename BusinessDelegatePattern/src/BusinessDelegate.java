
public class BusinessDelegate {

	private BusinessLookup businessLookup;
	private BusinessServer businessServer;
	
	public BusinessDelegate() {
		businessLookup = new BusinessLookup();
		businessServer = null;
	}
	
	public void setBusinessServer(String serverArea) {
		businessServer = businessLookup.lookup(serverArea);
	}
	
	public void doTask() {
		businessServer.process();
	}
}

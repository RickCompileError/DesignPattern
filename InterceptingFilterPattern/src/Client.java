
public class Client {

	private FilterManager fm;
	
	public Client() {
		
	}
	
	public Client(FilterManager fm) {
		this.fm = fm;
	}
	
	public void setFilterManager(FilterManager fm) {
		this.fm = fm;
	}
	
	public void sendRequest(String request) {
		fm.filterRequest(request);
	}
	
}

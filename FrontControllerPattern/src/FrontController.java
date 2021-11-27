
public class FrontController {

	private Dispatcher dispatcher;
	private String user;
	
	public FrontController(String user) {
		dispatcher = new Dispatcher();
		this.user = user;
	}
	
	public boolean isAuthenticUser() {
		return Database.findUser(user);
	}
	
	public void trackRequest(String web) {
		System.out.println(user + " try to visit " + web);
	}
	
	public void dispatchRequest(String web) {
		trackRequest(web);
		
		if (isAuthenticUser()) {
			dispatcher.dispatch(web);
		}
		else {
			System.out.println(user + " is under 18");
		}
	}
	
}

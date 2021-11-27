/*
 * This pattern is used to provide a centralized request handling mechanism so that 
 * all requests will be handled by a single handler.
 */

public class FrontControllerPatternDemo {

	public void demo() {
		FrontController user;
		
		user = new FrontController("Rick");
		user.dispatchRequest("xvideo");
		user.dispatchRequest("pornhub");
		System.out.println("-----------------------------------");
		
		user = new FrontController("Kevin");
		user.dispatchRequest("xvideo");
		System.out.println("-----------------------------------");
	}
	
	public static void main(String[] args) {
		FrontControllerPatternDemo fcpd = new FrontControllerPatternDemo();
		fcpd.demo();
	}
	
}

/*
 * This pattern is used when we want to do some pre-processing / post-processing 
 * with request or response of the application. 
 * Filters are defined and applied on the request before passing the request to actual target application.
 */

public class InterceptingFilterPatternDemo {
	
	public void demo() {
		FilterManager filterManager = new FilterManager(new Target());
		filterManager.setFilter(new Authentication());
		filterManager.setFilter(new Debug());
		
		Client client = new Client();
		client.setFilterManager(filterManager);
		client.sendRequest("Get Password");
		
	}
	
	public static void main(String[] args) {
		InterceptingFilterPatternDemo ifpd = new InterceptingFilterPatternDemo();
		ifpd.demo();
	}
	
}

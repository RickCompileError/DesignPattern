/*
 * This pattern is used when we want to locate various services using JNDI lookup.
 * For the first time a service is required, Service Locator looks up in JNDI and caches the service object. 
 * Further lookup or same service via Service Locator is done in its cache which 
 * improves the performance of application to great extent.
 */

public class ServiceLocatorPatternDemo {

	public void demo() {
		Service service = null;
		
		service = ServiceLocator.getService("Japan");
		service.execute();
		System.out.println("------------------------------------");
		
		service = ServiceLocator.getService("Taiwan");
		service.execute();
		System.out.println("------------------------------------");
		
		service = ServiceLocator.getService("USA");
		service.execute();
		System.out.println("------------------------------------");
		
		service = ServiceLocator.getService("Taiwan");
		service.execute();
		System.out.println("------------------------------------");
		
	}
	
	public static void main(String[] args) {
		ServiceLocatorPatternDemo slpd = new ServiceLocatorPatternDemo();
		slpd.demo();
	}
	
}

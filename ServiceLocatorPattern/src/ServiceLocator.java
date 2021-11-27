
public class ServiceLocator {

	private static Cache cache;
	
	static {
		cache = new Cache();
	}
	
	public static Service getService(String jndiName) {
		Service service = null;
		service = cache.getService(jndiName);
		
		if (service == null) {
			InitialContext ic = new InitialContext();
			service = ic.lookup(jndiName);
			cache.addService(service);
		}
		return service;
	}
	
}

import java.util.*;

public class Cache {

	private List<Service> services;
	
	public Cache() {
		services = new ArrayList<>();
	}
	
	public Service getService(String jndiName) {
		for (Service s: services) {
			if (s.getName().equalsIgnoreCase(jndiName)) return s;
		}
		return null;
	}
	
	public void addService(Service service) {
		services.add(service);
		System.out.println("Add " + service.getName() + " into cache");
	}
	
}

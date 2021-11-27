
public class InitialContext {

	public Service lookup(String jndiName) {
		if (jndiName.equalsIgnoreCase("Japan")) {
			return new JapanService();
		}
		else if (jndiName.equalsIgnoreCase("Taiwan")) {
			return new TaiwanService();
		}
		else if (jndiName.equalsIgnoreCase("USA")) {
			return new USAService();
		}
		else {
			return null;
		}
	}
	
}

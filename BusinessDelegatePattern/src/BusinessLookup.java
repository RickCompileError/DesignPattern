
public class BusinessLookup {

	public BusinessServer lookup(String serverArea) {
		if ("United States".equalsIgnoreCase(serverArea)) return new UnitedStatesServer();
		else if ("Taiwan".equalsIgnoreCase(serverArea)) return new TaiwanServer();
		else return new UnknownServer();
	}
	
}

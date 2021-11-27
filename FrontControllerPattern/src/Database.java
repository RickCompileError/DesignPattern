
public class Database {
	
	private static String[] users = {"Rick", "Boss", "Sam", "Tom"};
	
	public static boolean findUser(String user) {
		for (int i=0;i<users.length;i++) {
			if (users[i].equalsIgnoreCase(user)) return true;
		}
		return false;
	}
	
}

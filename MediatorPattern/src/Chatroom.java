import java.util.Date;

public class Chatroom {

	public static void showMessage(User user, String msg) {
		System.out.print(new Date().toString() + "[ " + user.getName() + ": ");
		System.out.println(msg + ". ]");
	}
	
}

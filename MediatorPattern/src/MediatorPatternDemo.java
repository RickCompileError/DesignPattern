/*
 * Under Behavioral Pattern
 * This pattern is used to reduce communication complexity between multiple objects or classes
 */

public class MediatorPatternDemo {
	
	public void demo() {
		User rick = new User("Rick");
		User boss = new User("Boss");
		User tom = new User("Tom");
		User sam = new User("Sam");
		
		rick.sendMessage("BABAGUAIMI");
		boss.sendMessage("SUBASUBA");
		tom.sendMessage("KEVIN");
		sam.sendMessage("BAT");
	}
	
	public static void main(String[] args) {
		MediatorPatternDemo mpd = new MediatorPatternDemo();
		mpd.demo();
	}
	
}

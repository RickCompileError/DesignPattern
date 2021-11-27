/*
 * Under Structural Pattern
 * This pattern represents functionality of another class
 */

public class ProxyPatternDemo {
	
	public void demo() {
		Website website = null;
		
		website = new ProxyWebsite("www.ntcu.edu.tw");
		for (int i=0;i<(int)(Math.random()*10);i++) website.show();
		System.out.println("--------------------------------------");

		website = new ProxyWebsite("www.pornhub.com");
		for (int i=0;i<(int)(Math.random()*10);i++) website.show();
		System.out.println("--------------------------------------");

		website = new ProxyWebsite("www.xvideos.com");
		for (int i=0;i<=(int)(Math.random()*10);i++) website.show();
		System.out.println("--------------------------------------");
	}
	
	public static void main(String[] args) {
		ProxyPatternDemo ppd = new ProxyPatternDemo();
		ppd.demo();
	}
}

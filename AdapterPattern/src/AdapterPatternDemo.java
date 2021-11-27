/*
 * Under Structural Pattern
 * This pattern involves a single class which is responsible to 
 * join functionalities of independent or incompatible interfaces
 */

public class AdapterPatternDemo {
	
	public void demo() {
		JavaSaver js = new JavaSaver();
		js.save("java", "turnoff");
		js.save("c++", "linkedlist");
		js.save("c", "ordermachine");
		js.save("php", "studentinfo");
	}
	
	public static void main(String[] args) {
		AdapterPatternDemo apd = new AdapterPatternDemo();
		apd.demo();
	}
	
}

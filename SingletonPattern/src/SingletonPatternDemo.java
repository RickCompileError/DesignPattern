/* 
 * Under Creational Pattern
 * Singleton Pattern provides a way to access its only object 
 * which can be accessed directly without need to instantiate the object of the class
 */

public class SingletonPatternDemo {
	
	public void demo1() {
		System.out.println("Demo 1:");
		
		SingleObjectVer1 sov11 = SingleObjectVer1.getInstantiate();
		SingleObjectVer1 sov12 = SingleObjectVer1.getInstantiate();
		System.out.println("sov11 current number is "+sov11.getNumber());
		System.out.println("sov12 current number is "+sov12.getNumber());
		System.out.println("sov11 current number is "+sov11.getNumber());
		
		if (sov11 == sov11.getIns()) System.out.println("Same");
		else System.out.println("Not same");
		System.out.println("--------------------------------------");
	}
	
	public void demo2() {
		System.out.println("Demo 2:");
		
		SingleObjectVer2 sov21 = SingleObjectVer2.getInstantiate();
		SingleObjectVer2 sov22 = SingleObjectVer2.getInstantiate();
		System.out.println("sov21 current number is "+sov21.getNumber());
		System.out.println("sov22 current number is "+sov22.getNumber());
		System.out.println("sov21 current number is "+sov21.getNumber());
		
		if (sov21 == sov21.getIns()) System.out.println("Same");	
		else System.out.println("Not same");
		System.out.println("--------------------------------------");
	}
	
	public void demo3() {
		System.out.println("Demo 3:");
		
		SingleObjectVer3 sov31 = SingleObjectVer3.getInstantiate();
		SingleObjectVer3 sov32 = SingleObjectVer3.getInstantiate();
		System.out.println("sov31 current number is "+sov31.getNumber());
		System.out.println("sov32 current number is "+sov32.getNumber());
		System.out.println("sov31 current number is "+sov31.getNumber());
		
		if (sov31 == sov31.getIns()) System.out.println("Same");	
		else System.out.println("Not same");
		System.out.println("--------------------------------------");
	}
	
	public static void main(String[] args) {
		SingletonPatternDemo spd = new SingletonPatternDemo();
		spd.demo1();
		spd.demo2();
		spd.demo3();
	}
	
}

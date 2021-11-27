/* 
 * This version can always guaranteed thread safe
 * because the object is initiated when the class is loaded
 */

public class SingleObjectVer2 {
	
	private static SingleObjectVer2 instantiate = new SingleObjectVer2();
	private int number;
	
	private SingleObjectVer2() {
		number = 0;
	}
	
	public static SingleObjectVer2 getInstantiate() {
		return instantiate;
	}

	public int getNumber() {
		return number++;
	}
	
	public SingleObjectVer2 getIns() {
		return instantiate;
	}
	
}

/* 
 * This version is called lazy instantiate 
 * because it only be created when we need it
 * but it is not thread safe
 */

public class SingleObjectVer1 {
	
	private static SingleObjectVer1 instantiate = null;
	private int number;
	
	private SingleObjectVer1() {
		number = 0;
	}
	
	public static SingleObjectVer1 getInstantiate() {
		if (instantiate == null) instantiate = new SingleObjectVer1();
		return instantiate;
	}
	
	public int getNumber() {
		return number++;
	}
	
	public SingleObjectVer1 getIns() {
		return instantiate;
	}
	
}

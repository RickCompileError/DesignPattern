/* 
 * This version can make sure only one thread at a time by using synchronized
 */

public class SingleObjectVer3 {
	
	private static SingleObjectVer3 instantiate;
	private int number;
	
	private SingleObjectVer3() {
		number = 0;
	}
	
	public static synchronized SingleObjectVer3 getInstantiate() {
		if (instantiate == null) instantiate = new SingleObjectVer3();
		return instantiate;
	}

	public int getNumber() {
		return number++;
	}
	
	public SingleObjectVer3 getIns() {
		return instantiate;
	}
	
}

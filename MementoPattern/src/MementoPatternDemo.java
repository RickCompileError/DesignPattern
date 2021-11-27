/*
 * Under Behavioral Pattern
 * This pattern is used to restored the state of an object to a previous state
 */
public class MementoPatternDemo {
	
	public void demo() {
		Character boss = new Character("Boss");
		RecordTaker rt = new RecordTaker();

		System.out.println(boss);
		rt.add(boss.saveRecord());
		System.out.println();
		
		System.out.println(boss.getName() + " start advertrue.\n");
		System.out.println(boss.getName() + " encounter the moster");
		System.out.println(boss.getName() + " success defeat the moster");
		boss.levelUp();
		System.out.println(boss);
		System.out.println();

		rt.add(boss.saveRecord());
		System.out.println();

		System.out.println(boss.getName() + " encounter Kevin");
		System.out.println(boss.getName() + " success defeat Kevin");
		boss.levelUp();
		boss.levelUp();
		boss.levelUp();
		boss.levelUp();
		boss.levelUp();
		System.out.println(boss);

		rt.add(boss.saveRecord());
		System.out.println();
		
		System.out.println(boss.getName() + " have to restart because company bankrupt");
		boss.readRecord(rt.get(1));
		
		System.out.println(boss);
		
	}
	
	public static void main(String[] args) {
		MementoPatternDemo mpd = new MementoPatternDemo();
		mpd.demo();
	}
	
}

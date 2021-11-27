/*
 * Under Behavioral Pattern
 * In this pattern, a class behavior changes based on its state.
 * A context object whose behavior varies as its state object changes.
 */

public class StatePatternDemo {
	
	public void demo() {
		Game game = new Game();
		game.setState(new StartState());
		game.show();
		game.show();
		game.setState(new EndState());
		game.show();
		game.show();
		game.setState(new StartState());
		game.show();
		game.show();
	}
	
	public static void main(String[] args) {
		StatePatternDemo spd = new StatePatternDemo();
		spd.demo();
	}
}

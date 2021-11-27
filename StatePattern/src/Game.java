
public class Game {

	private State state;
	
	public Game() {
		state = null;
	}
	
	public void setState(State state) {
		this.state = state;
		this.state.trigger();
	}
	
	public State getState() {
		return state;
	}
	
	public void show() {
		System.out.println("State: " + state);
	}
	
}


public class EndState implements State {

	@Override
	public void trigger() {
		// TODO Auto-generated method stub
		System.out.println("Game Over");
	}

	public String toString() {
		return "End State";
	}
	
}

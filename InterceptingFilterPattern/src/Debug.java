
public class Debug implements Filter {

	@Override
	public void execute(String request) {
		// TODO Auto-generated method stub
		System.out.println("Logging request: " + request);
	}

}

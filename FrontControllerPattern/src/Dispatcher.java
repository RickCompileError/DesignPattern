
public class Dispatcher {

	private Website x;
	private Website p;
	
	public Dispatcher() {
		x = new Xvideo();
		p = new Pornhub();
	}
	
	public void dispatch(String website) {
		if ("Xvideo".equalsIgnoreCase(website)) {
			x.show();
		}
		else if ("Pornhub".equalsIgnoreCase(website)) {
			p.show();
		}
		else {
			System.out.println("Doesn't found website");
		}
	}
	
}

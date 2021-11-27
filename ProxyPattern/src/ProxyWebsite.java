
public class ProxyWebsite implements Website {

	private Website realWebsite = null;
	private int time;
	
	public ProxyWebsite(String url) {
		realWebsite = new RealWebsite(url);
		time = 0;
	}
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.print(++time + " times, ");
		realWebsite.show();
	}

}


public class RealWebsite implements Website {

	private String url;
	
	public RealWebsite(String url) {
		catchURL(url);
		this.url = url;
	}
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Show content from url " + url);
	}
	
	public void catchURL(String url) {
		System.out.println("Catch website content on net");
	}

}

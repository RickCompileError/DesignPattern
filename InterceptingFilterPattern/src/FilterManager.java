
public class FilterManager {

	private FilterChain filterChain;
	
	public FilterManager(Target target) {
		filterChain = new FilterChain(target);
	}
	
	public void setFilter(Filter filter) {
		filterChain.addFilter(filter);
	}
	
	public void filterRequest(String request) {
		filterChain.execute(request);
	}
	
}

import java.util.*;

public class FilterChain {

	private List<Filter> filters;
	private Target target;
	
	public FilterChain(Target target) {
		filters = new ArrayList<>();
		this.target = target;
	}
	
	public void addFilter(Filter filter) {
		filters.add(filter);
	}
	
	public void execute(String request) {
		for (Filter f: filters) {
			f.execute(request);
		}
		target.execute(request);
	}
	
	public void setTarget(Target target) {
		this.target = target;
	}
	
}

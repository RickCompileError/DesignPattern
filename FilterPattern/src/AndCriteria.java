import java.util.*;

public class AndCriteria implements Criteria {

	private Criteria[] criterias = null;
	
	public AndCriteria(Criteria ...criterias) {
		this.criterias = criterias;
	}
	
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		// TODO Auto-generated method stub
		
		List<Person> andPersons = List.copyOf(persons);
		
		for (Criteria c: criterias) {
			andPersons = c.meetCriteria(andPersons);
		}
		return andPersons;
	}

}

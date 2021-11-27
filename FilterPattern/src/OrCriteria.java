import java.util.*;

public class OrCriteria implements Criteria {

	private Criteria[] criterias = null;
	
	public OrCriteria(Criteria ...criterias) {
		this.criterias = criterias;
	}
	
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		// TODO Auto-generated method stub
		
		List<Person> orPersons = new ArrayList<>();
		
		for (Criteria c: criterias) {
			List<Person> meetPersons = c.meetCriteria(persons);
			for (Person p: meetPersons) {
				if (!orPersons.contains(p)) orPersons.add(p);
			}
		}
		return orPersons;
	}

}

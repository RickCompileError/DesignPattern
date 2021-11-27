import java.util.ArrayList;
import java.util.List;

public class ThinCriteria implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		// TODO Auto-generated method stub
		
		List<Person> thinPersons = new ArrayList<>();
		
		for (Person p: persons) {
			if (p.getWeight()<85) thinPersons.add(p);
		}
		return thinPersons;
	}

}

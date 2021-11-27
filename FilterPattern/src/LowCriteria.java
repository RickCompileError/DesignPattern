import java.util.ArrayList;
import java.util.List;

public class LowCriteria implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		// TODO Auto-generated method stub
		
		List<Person> lowPersons = new ArrayList<>();
		
		for (Person p: persons) {
			if (p.getHeight()<170) lowPersons.add(p);
		}
		return lowPersons;
	}

}

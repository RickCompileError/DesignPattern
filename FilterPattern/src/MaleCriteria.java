import java.util.ArrayList;
import java.util.List;

public class MaleCriteria implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		// TODO Auto-generated method stub
		
		List<Person> malePersons = new ArrayList<>();
		
		for (Person p: persons) {
			if (p.getGender().equals("Male")) malePersons.add(p);
		}
		return malePersons;
	}

}

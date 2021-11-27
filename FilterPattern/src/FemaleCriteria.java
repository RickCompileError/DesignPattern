import java.util.ArrayList;
import java.util.List;

public class FemaleCriteria implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		// TODO Auto-generated method stub
		
		List<Person> femalePersons = new ArrayList<>();
		
		for (Person p: persons) {
			if (p.getGender().equals("Female")) femalePersons.add(p);
		}
		return femalePersons;
	}

}

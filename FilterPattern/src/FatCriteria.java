import java.util.ArrayList;
import java.util.List;

public class FatCriteria implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		// TODO Auto-generated method stub
		
		List<Person> fatPersons = new ArrayList<>();
		
		for (Person p: persons) {
			if (p.getWeight()>=85) fatPersons.add(p);
		}
		return fatPersons;
	}

}

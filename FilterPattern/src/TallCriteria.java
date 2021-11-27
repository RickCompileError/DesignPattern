import java.util.*;

public class TallCriteria implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		// TODO Auto-generated method stub
		
		List<Person> tallPersons = new ArrayList<>();
		
		for (Person p: persons) {
			if (p.getHeight()>=170) tallPersons.add(p);
		}
		return tallPersons;
	}

}

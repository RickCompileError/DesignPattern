
public class BuildingVisitor implements Visitor {

	@Override
	public void visitSchool(School school) {
		// TODO Auto-generated method stub
		System.out.println("Visit " + school.getName());
	}

	@Override
	public void visitFactory(Company factory) {
		// TODO Auto-generated method stub
		System.out.println("Visit " + factory.getName());
	}

	@Override
	public void visitChurch(Church church) {
		// TODO Auto-generated method stub
		System.out.println("Visit " + church.getName());
	}

}

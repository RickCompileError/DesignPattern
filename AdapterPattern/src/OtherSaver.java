
public class OtherSaver implements LanguagueSaver {

	AdvancedSaver advancedSaver = null;
	
	@Override
	public void save(String fileType, String fileName) {
		// TODO Auto-generated method stub
		if (fileType.equalsIgnoreCase("C")) advancedSaver = new CSaver();
		if (fileType.equalsIgnoreCase("C++")) advancedSaver = new CplusplusSaver();
		advancedSaver.save(fileName);
	}

}

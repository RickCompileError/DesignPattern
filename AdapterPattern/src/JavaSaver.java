
public class JavaSaver implements LanguagueSaver {

	OtherSaver otherSaver = null;
	
	public JavaSaver() {
		otherSaver = new OtherSaver();
	}
	
	@Override
	public void save(String fileType, String fileName) {
		// TODO Auto-generated method stub
		
		if (fileType.equalsIgnoreCase("Java")) {
			System.out.print("Save " + fileName);
			System.out.println(" as " + fileName + ".java");
		}
		else if (fileType.equalsIgnoreCase("C") || fileType.equalsIgnoreCase("C++")) {
			otherSaver.save(fileType,fileName);
		}
		else {
			System.out.println("The file type " + "\"" + fileType + "\"" + " doesn't exist.");
		}
	}

}

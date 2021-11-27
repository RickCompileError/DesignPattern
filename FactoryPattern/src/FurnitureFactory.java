
public class FurnitureFactory {
	public Furniture getFurniture(String furnitureType) {
		if (furnitureType == null) return null;
		if (furnitureType.equalsIgnoreCase("Bed")) return new Bed();
		else if (furnitureType.equalsIgnoreCase("Chair")) return new Chair();
		else if (furnitureType.equalsIgnoreCase("Table")) return new Table();
		return null;
	}
}

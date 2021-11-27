
public class StrawberryFactory implements DesertFactory {
	public Desert getDesert(String desertType) {
		if (desertType.equals("Pancake")) return new StrawberryPancake();
		if (desertType.equals("IceCream")) return new StrawberryIceCream();
		return null;
	}
}

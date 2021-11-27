
public class ChocolateFactory implements DesertFactory {
	public Desert getDesert(String desertType) {
		if (desertType.equals("Pancake")) return new ChocolatePancake();
		if (desertType.equals("IceCream")) return new ChocolateIceCream();
		return null;
	}
}

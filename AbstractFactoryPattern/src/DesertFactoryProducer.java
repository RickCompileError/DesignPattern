
public class DesertFactoryProducer {
	public static DesertFactory getDesertFactory(String flavor) {
		if (flavor.equals("Chocolate")) return new ChocolateFactory();
		if (flavor.equals("Strawberry")) return new StrawberryFactory();
		return null;
	}
}

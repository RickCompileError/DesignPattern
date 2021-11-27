import java.util.*;

public class ShapeFactory {

	public static final HashMap<String,Shape> circleMap = new HashMap<>();
	
	public static Shape getCircle(String color) {
		Shape circle = (Circle)circleMap.get(color);
		
		if (circle==null) {
			circle = new Circle(color);
			circleMap.put(color,circle);
			System.out.println("Create circle with color " + color);
			System.out.println("--------------------------------------------------");
		}
		return circle;
	}
}

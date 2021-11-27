/*
 * Under Structural Pattern
 * This pattern is primarily used to reduce the number of objects created and 
 * to decrease memory footprint and increase performance
 * Main concept is reusing the similar objects already existing 
 */

public class FlyweightPatternDemo {
	
	private static String[] color = {"Blue","Red","Yellow","Green","Purple"};
	
	public void demo() {
		Circle circle = null;
		for (int i=0;i<20;i++) {
			circle = (Circle)ShapeFactory.getCircle(color[i%5]);
			circle.setX(getX());
			circle.setY(getY());
			circle.draw();
		}
	}
	
	public String getColor() {
		return color[(int)(Math.random()*color.length)];
	}
	
	public int getX() {
		return (int)(Math.random()*10);
	}
	
	public int getY() {
		return (int)(Math.random()*10);
	}
	
	public static void main(String[] args) {
		FlyweightPatternDemo fpd = new FlyweightPatternDemo();
		fpd.demo();
	}
}

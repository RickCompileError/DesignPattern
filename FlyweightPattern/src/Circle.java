
public class Circle implements Shape {

	private int x = 0;
	private int y = 0;
	private String color;
	
	public Circle(String color) {
		setColor(color);
	}
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Circle [x: " + x + ", y: " + y + ", color: " + color + "]");
		System.out.println("--------------------------------------------------");
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void setColor(String color) {
		this.color = color;
	}

}
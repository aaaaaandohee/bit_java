package day14_ex_interface;

public class ShapeTest {

	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle(5, 6);
		RectTriangle r2 = new RectTriangle(6, 2);
		
		Shape[] shapes = {r1, r2};
		for(Shape data : shapes) {
			System.out.println("area: " + data.getArea());
			if(data instanceof Resizable) {
				((Resizable) data).resize(0.5);
				System.out.println("new area: " + data.getArea());
			} 
		}
	}
}

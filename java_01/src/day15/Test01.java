package day15;

import day14_interface_clone.Circle;
import day14_interface_clone.Point;

public class Test01 {
	public static void main(String[] args) throws Exception {
		Point p1 = new Point(5, 5);
		Point p2 = p1.clone();
		
		Point p3 = p2;
		
		p2.setX(0);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		System.out.println("============================");
		
		Circle c1 = new Circle(new Point(7,7), 2);
		Circle c2 = c1.clone();
		c2.r = 0;
		c2.p.setX(0);
		System.out.println(c1);
		System.out.println(c2);
	}
}

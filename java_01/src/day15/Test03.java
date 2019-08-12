package day15;

import day14_interface_clone.Point;

public class Test03 {

	public static void main(String[] args) {
		Outer.Inner i = new Outer().new Inner();
		i.print();
	}

}

class Outer {
	
	Point p = new Point(3, 3);
	
	class Inner {
		void print() {
			System.out.println(p);
		}
	}
	
}


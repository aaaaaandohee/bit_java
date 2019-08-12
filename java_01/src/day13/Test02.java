package day13;

public class Test02 {

	public static void main(String[] args) {
		Point p = new Point(3,3);
		System.out.println(p); //toString을 오버라이딩했기때문에   Point [x=3, y=3] 찍힘 -> p.toString()으로 실행되기 때문.
		
		Circle2 c1 = new Circle2();
		c1.setP(p);
		System.out.println(c1);
		
		Circle2 c2 = new Circle2(new Point(7,7),5);
		System.out.println(c2);
	}

}
 
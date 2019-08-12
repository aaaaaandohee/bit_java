package day12_ex;

public class TestShape {

	public static void main(String[] args) {
		Shape[] shape = new Shape[2]; //객체를 만드는 것이 아니라 배열을 만드는 것. 객체는 생성자함수를 사용해서 생성.
		
		shape[0] = new Circle("원",10);
		shape[1] = new Rectangle("직사각형",10,20);
		
		for(int i=0 ; i<shape.length; i++) {
			shape[i].calculationArea();
			shape[i].print();
		}
	}

}

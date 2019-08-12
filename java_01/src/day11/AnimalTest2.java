package day11;

import day10.Animal;
import day10.Dog;

public class AnimalTest2 {

	public static void main(String[] args) {
		Animal[] animals = {
							new Dog("진돗개", "쫑이"),
							new Fish("구피"),
							new Dog("시베리안허스키", "케리")
							};
		
//		for(Animal data : animals) {
//			data.breath();
//			data.print();
//		}
		
		
		Dog a1 = new Dog("진돗개", "쫑이");
		Fish f1 = new Fish("구피");
		
		callD(animals[0]); //같은 메소드인데 서로 다르게 동작.(다형성)
		callD(animals[1]);
				
	}
	
	//메소드 오버로딩
//	public static void callD(Dog d) { //breath는 오버라이딩된 자원이기 때문에 필요없음. 아래의 Animal 타입의 매개변수받는 함수만 선언하면 됨.
//		d.breath();
//	}
//	public static void callD(Fish d) { //breath는 오버라이딩된 자원이기 때문에 필요없음. 아래의 Animal 타입의 매개변수받는 함수만 선언하면 됨.
//		d.breath();
//	}
	
	
	public static void callD(Animal d) { //매개변수를 부모타입으로 선언 > 상황에 따라 다르게 동작가능. is a 관계 이용.
		d.breath(); //매개변수가 어떤게 들어오느냐에 따라서 다르게 동작함.(다형성) -> 오버라이딩되어있기 때문. 
	}

}

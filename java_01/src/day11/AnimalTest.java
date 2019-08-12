package day11;

import day10.Animal;
import day10.Dog;

public class AnimalTest {

	public static void main(String[] args) {
		Animal d = new Dog("진돗개","쫑이");
		if(d instanceof Dog) ((Dog)d).dogPrint(); //d가 Dog 타입이면 Dog로 다운캐스팅
		d.breath();
		Animal f = new Fish("구피");
		if(f instanceof Fish) ((Fish)f).fishPrint();
		f.breath(); //f가 Animal 타입인데도 Fish의 breath가 호출됨.->오버라이딩했기 때문.
		((Fish)f).breath();
		
	}
	
	
	

}

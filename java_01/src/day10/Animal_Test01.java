package day10;

public class Animal_Test01 {

	public static void main(String[] args) {
		
		Animal a1 = new Animal();
		a1.breath();
		
		Animal a2 = new Animal("Dog");
		a2.breath();
		
		Dog d1 = new Dog("시베리안 허스키","케리");
		d1.breath();
		d1.dogPrint();
		
		
		Dog d2 = new Dog("Dog","진돗개","쫑이");
		d2.dogPrint();
		
//		String animalKind = d2.super.getKind(); //static 영역에서는 this super 사용불가
		String animalKind = d2.getSuperKind(); //클래스 추가 하여 접근해서 사용
		System.out.println(animalKind);
	}

}

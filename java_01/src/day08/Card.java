package day08;

public class Card {

	final static int WIDTH = 100; //카드마다 크기는 같기 때문에 스태틱 선언. 수정할 수 없게 상수화 처리-final
	final static int HEIGHT = 250; //상수화 처리된 변수는 주로 대문자사용
	
	String kind = "다이아몬드"; //instance variable - new로 메모리에 띄어야지만 사용가능
	int number;
	
	
	public static void main(String[] args) {
		
//		Card.width=0; - final처리 된 변수라서 수정 불가능
		
		System.out.println(WIDTH + " * " + HEIGHT);
//		System.out.println(kind); // new로 메모리에 띄어야지만 사용가능
		System.out.println(new Card().kind);
	}
	
	
}

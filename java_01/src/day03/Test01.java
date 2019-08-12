package day03;

public class Test01 {

	public static void main(String[] args) {
		
		// == 연산자: 기본형 데이터의 값이 같은지 비교할 때 사용
		// equals() 메소드 : 참조형 데이터의 값이 같은지 비교할 때 사용
		
		int num1 = 99;
		int num2 = 99;
		
		String name1 = "홍길동";
		String name2 = "홍길동";
		
		String msg1 = new String("Hello");
		String msg2 = new String("Hello java");
		
		System.out.println("num1 == num2 => " + (num1 == num2));
//		System.out.println("name1 == name2 => " + (name1 == name2)); //참조형이지만 new안써서 ==도 작동
		System.out.println("name1 == name2 => " + name1.equals(name2)); 
		System.out.println("msg1 == msg2 => " + msg1.equals(msg2)); //참조형이기 때문에 주소를 비교하는 것이아니라 가리키는 값이 같은지 비교해야하기때문
		
		msg1 = msg2; //msg2이 가리키던 주소를 msg1에 넣어줌. 같은 곳을 가리킴. msg1이 가리키던 곳은 가비지가 됨
	
	}

}

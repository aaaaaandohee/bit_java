package day16;

public class Test01 {

	public static void main(String[] args) {
		System.out.println(" main start ");
		int a = 10, b = 0;
		
		try {
			System.out.println(1);
			System.out.println(a/b); //예외가 발생하여 내부적으로 이 객체 생성되어서 던져짐. throw new ArithmeticException()
			System.out.println(2); // 윗 줄에서 예외 발생해서 2는 출력하지않고 catch구문으로 감.
		} catch (ArithmeticException e) {
			System.out.println("예외 발생 : " + e.getMessage());
			e.printStackTrace(); //예외 좀 더 자세히 찍어줌.
			System.out.println(3);
		} finally { //예외가 발생하든 발생하지않든 항상 수행됨
			System.out.println("finally { 항 상 수 행 } ");
		}
		
		System.out.println("--------------------------");
		
		
		if(b!=0) System.out.println(a/b);
		
		
		System.out.println(" main end ");
	}

}

//		ArithmeticException ss;
//		NullPointerException nn;
//		IndexOutOfBoundsException ii;
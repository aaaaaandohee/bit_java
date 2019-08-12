package day07;

public class Calc {
	
	//static variable = class variable - 클래스 이름으로 접근함.
	static int data = 0; //static 없으면 > instance variable - new로 메모리에 띄워서 사용해야함. this 사용 가능
	
	//static method = class method - 클래스 이름으로 접근함.
	public long add(int a, int b) {  //static 없으면 > instance method - new로 메모리에 띄워서 사용해야함.
		System.out.println(Calc.data); //static 자원은 항상 앞에 클래스 이름을 가지고 있음. 생략가능. 나의 클래스 이름으로 자동 처리됨.
		System.out.println(Math.random()); //instance method에서 static자원으로의 접근은 가능함.
		return a+b;                    
	}
	public static long sub(int a, int b) { //instance variable은 static 함수 안에서 접근 불가. static 빼면 접근 가능. static안에서는 this사용불가. 인스턴스 자원에 접근불가
		return a-b;
	}
	public static long mul(int a, int b) {
		return a*b;
	}
	public static long div(int a, int b) {
		if(b==0) {
			return 0;
		}
		return a/b;
	}

}

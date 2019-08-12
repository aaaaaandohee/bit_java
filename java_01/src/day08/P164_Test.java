package day08;

public class P164_Test { //여러개의 클래스가 있을 경우에는 메인메소드가 있는 클래스의 이름으로 파일이름 지정. -> 퍼블릭 클래스이어야 함.
	                     //퍼블릭 클래스가 두개 일 순 없음. 소스코드 분리해야함.

	public static void main(String[] args) {
		Count c1  = new Count();
		System.out.println(Count.count);
		Count c2  = new Count();
		System.out.println(c2.count);
		Count c3  = new Count();
		System.out.println(c3.count);
		Count c4  = new Count();
		System.out.println(c4.count);
	}

}


class Count{  //하나의 자바파일 안에는 퍼블릭 클래스가 두개 일 순 없음. 소스코드 분리해야함.
	int c;
	static int count;
	public Count() {
		c++; //객체마다 각각 힙에 올라있어서 다르기 때문에 공유되지 않음
		count++; //모든 객체가 공유해서 사용하기 때문에 증가.
	}
}


